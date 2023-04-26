package sesson_4_abstract_factory;

public class WindowsGraphicsFactory implements GraphicsFactory{
    @Override
    public Graphics newGraphics() {
        return new WindowsGraphics();
    }
}
