package sesson_3_factory_method_design_pattern;

public class ProductOrderCreatorImpl extends ProductOrderCreator{
    private static final long DEFAULT_PRICE = 1000;
    @Override
    protected Product newProduct(String name) {
        final Product product;
        if(name.endsWith("FREE")){
            product = new FreeProduct();
        }else {
            final PricedProduct pricedProduct = new PricedProduct();
            pricedProduct.setPrice(DEFAULT_PRICE);
            product = pricedProduct;
        }
        product.setName(name);
        return product;
    }
}
