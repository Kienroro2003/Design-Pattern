package sesson_2_factory_design_pattern;

public class Factory {
    public Product newProduct(String name, long price){
        final Product product;
        if(price == 0){
            product = new FreeProduct();
            product.setPrice(price);
            product.setName(name + " FREE");
        }else{
            product = new PricedProduct();
            product.setName(name);
            product.setPrice(price);
        }
        return product;
    }
}
