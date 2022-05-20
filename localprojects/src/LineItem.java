public class LineItem {

    private String itemId;
    private int quantity;
    private String name;
    private double price;

    public String getPromotionTypes() {
        return promotionTypes;
    }

    public void setPromotionTypes(String promotionTypes) {
        this.promotionTypes = promotionTypes;
    }

    private String promotionTypes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LineItem(String itemId, int quantity){
        this.itemId = itemId;
        this.quantity = quantity;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }



}
