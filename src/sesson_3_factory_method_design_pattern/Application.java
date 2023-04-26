package sesson_3_factory_method_design_pattern;

public class Application {
    public static void main(String[] args) {
        final ProductOrderCreator productOrderCreator = new ProductOrderCreatorImpl();
        productOrderCreator.orderProduct("Book FREE", 1);
    }
}
