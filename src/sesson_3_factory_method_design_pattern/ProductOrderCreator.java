package sesson_3_factory_method_design_pattern;

public abstract class ProductOrderCreator {
    public void orderProduct(String name, long amount){
        final Product product = newProduct(name);
        storeProduct(product, amount);
    }

    protected abstract Product newProduct(String name);

    private void storeProduct(Product product, long amount){

    }
}
