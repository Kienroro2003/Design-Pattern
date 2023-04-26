package sesson_4_abstract_factory;

public class Application {
    public static void main(String[] args) {
        final GraphicsFactory graphicsFactory = new GraphicsFactoryImpl();
        final Graphics graphics = graphicsFactory.newGraphics();
        graphics.draw();
    }
}
