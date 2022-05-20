

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Sample {

    public static void main(String args[]){
        Map<String, Product> products = new HashMap();
        products.put("A",new Product("A", 10.00, "null"));
        products.put("B",new Product("B", 9.00, "BUY_A_GET_B_HALF" ));
        products.put("C",new Product("C", 10.00, "null" ));
        products.put("X",new Product("X", 10.00, "null" ));
        products.put("Y",new Product("Y", 5.00, "CHEAP" ));
        products.put("Z",new Product("Z", 4.00, "null" ));
        products.put("P",new Product("P", 3.00, "null" ));
        products.put("Q",new Product("Q", 8.00, "null" ));
        products.put("R",new Product("R", 2.00, "CHEAP" ));

        System.out.println(getTotalPrice(new ShoppingsCart().getCart(), products));

    }

    public static Double getTotalPrice(Map<String, Integer> cart, Map<String, Product> products){
        Double totalPrice = 0.0;
        Set<String> keys = cart.keySet();
        for(String key : keys){
            Product crntProduct = products.get(key);
            if(crntProduct.getPromotionType().equals("CHEAP")){
                if(cart.get(key) % 2 == 0){
                    totalPrice = totalPrice + (cart.get(key)/2)*crntProduct.getPrice();
                }
            } else if(cart.containsKey("A") && cart.containsKey("B")){
                if(crntProduct.getPromotionType().equals("BUY_A_GET_B_HALF")){
                    var equalAs = crntProduct.getHalf()*cart.get("A");
                    var remaing = cart.get(key) - cart.get("A");
                    var fullProductPrice = crntProduct.getPrice()*remaing;
                    totalPrice = totalPrice + equalAs +fullProductPrice;
                }else {
                    totalPrice = totalPrice + (cart.get(key) * crntProduct.getPrice());
                }
            }else{
                totalPrice = totalPrice + (cart.get(key) * crntProduct.getPrice());
            }
        }
        return totalPrice;
    }

}

enum ProductNames{
    TV, AUDIO, VCR
}

class ShoppingsCart{

    public Map<String,Integer> getCart(){
        Map<String,Integer> shoppingCart = new HashMap<>();
//        shoppingCart.put("X",10);
//        shoppingCart.put("Y",2);
//        shoppingCart.put("Z",10);
//        shoppingCart.put("P",10);
//        shoppingCart.put("Q",10);
//        shoppingCart.put("R",10);

        shoppingCart.put("A",1);
        shoppingCart.put("B",2);
        return shoppingCart;
    }

}


class Product{
    private String name;
    private Double price;
    private String promotionType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPromotionType() {
        return promotionType;
    }

    public void setPromotionType(String promotionType) {
        this.promotionType = promotionType;
    }

    public  Product(String name, Double price, String promotionType){
        this.name  = name;
        this.price = price;
        this.promotionType = promotionType;
    }

    public Double getHalf(){
        return this.price/2;
    }

}