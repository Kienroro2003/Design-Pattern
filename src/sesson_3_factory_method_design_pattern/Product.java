package sesson_3_factory_method_design_pattern;

public abstract class Product {
    private String name;
//    private long price;

    public abstract long getPrice();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public long getPrice() {
//        return price;
//    }
//
//    public void setPrice(long price) {
//        this.price = price;
//    }
}
