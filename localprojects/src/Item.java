import java.math.BigDecimal;

public class Item {

    private final String id;
    private final ItemType itemType;
    private final String name;
    private final double price;

    public String getPromotionType() {
        return promotionType;
    }

    public void setPromotionType(String promotionType) {
        this.promotionType = promotionType;
    }

    private String promotionType;

    public Item(String id, String name, ItemType itemType, double price, String promotionType){
        this.id = id;
        this.itemType = itemType;
        this.name = name;
        this.price = price;
        this.promotionType = promotionType;
    }


    public String getId() {
        return id;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }


}
