package sesson_4_abstract_factory;

public class GraphicsFactoryImpl implements GraphicsFactory{
    private final GraphicsFactory windowsGraphicsFactory = new WindowsGraphicsFactory();
    private final GraphicsFactory abuntuGraphicsFactory = new UbuntuGraphicsFactory();
    @Override
    public Graphics newGraphics() {
        final String os = System.getProperty("os.name");
        System.out.println(os);
        if("window".equals(os)){
            return windowsGraphicsFactory.newGraphics();
        }
        return abuntuGraphicsFactory.newGraphics();
    }
}
