public enum ItemType {

    A("null"), B("B1G1H"), X("null"), Y("CHEAP"), Z("null"), P("null"), Q("null"), R("null");

    ItemType(String type) {
        this.type = type;
    }

    private String type;

    public String getPromotionType(){
        return type;
    }
}
