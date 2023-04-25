package sesson_2_factory_design_pattern;

public class PricedProduct extends Product{
    @Override
    public long order(long amount) {
        return getPrice() * amount;
    }
}
