package sesson_4_abstract_factory;

public class UbuntuGraphicsFactory implements GraphicsFactory{
    @Override
    public Graphics newGraphics() {
        return new UbuntuGraphics();
    }
}
