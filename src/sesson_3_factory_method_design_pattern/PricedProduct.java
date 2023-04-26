package sesson_3_factory_method_design_pattern;

public class PricedProduct extends Product {
    private long price;
    @Override
    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
