import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ShoppingCart {
    private final Inventory inventory;
    private Map<String, LineItem> itemsInCart = new HashMap<>();

    public ShoppingCart(Inventory inventory){
        this.inventory = inventory;
    }


    public void addItem(LineItem lineItem){
        Item item = inventory.get(lineItem.getItemId());
        lineItem.setName(item.getName());
        lineItem.setPrice(item.getPrice());
        lineItem.setPromotionTypes(item.getItemType().getPromotionType());
        this.itemsInCart.put(lineItem.getItemId(), lineItem);
    }

    public double getTotalPrice(){
        Set<String> keys = this.itemsInCart.keySet();
        double totalPrice = 0.0;
        for(String lineItemId: keys){
            LineItem item = itemsInCart.get(lineItemId);
            totalPrice = totalPrice + item.getPrice()*item.getQuantity();
        }
        return totalPrice;
    }

    public double getTotalPriceWithPromotion2(){
        Set<String> lineItemIds = this.itemsInCart.keySet();
        double totalPrice = 0.0;
        for(String lineItemId: lineItemIds){
            LineItem item = itemsInCart.get(lineItemId);
            if(item.getPromotionTypes().equals("CHEAP")){
                if(item.getQuantity() % 2 == 0 ){
                    totalPrice = totalPrice + (item.getPrice()/2)*item.getQuantity();
                }
            }else{
                totalPrice = totalPrice + item.getPrice()*item.getQuantity();
            }
        }
        return totalPrice;
    }

    public double getTotalPriceWithPromotion1(){
        double totalPrice = 0.0;
        Set<String> lineItemIds = this.itemsInCart.keySet();
        for(String lineItemId: lineItemIds){
            LineItem currentItem = itemsInCart.get(lineItemId);
           if(itemsInCart.containsKey("item1") && itemsInCart.containsKey("item2")){
               if(currentItem.getPromotionTypes().equals("B1G1H")){
                   double halfPriceOfItemB = (currentItem.getPrice()/2)*itemsInCart.get("item1").getQuantity();
                   int remainingQty = currentItem.getQuantity() - itemsInCart.get("item1").getQuantity();
                   double fullPriceOfB = currentItem.getPrice()*remainingQty;
                   totalPrice = totalPrice + halfPriceOfItemB + fullPriceOfB;
               }else {
                   totalPrice = totalPrice + (currentItem.getQuantity()*currentItem.getPrice());
               }
           }else{
               totalPrice = totalPrice + currentItem.getPrice()*currentItem.getQuantity();
           }
        }
        return totalPrice;
    }
}
