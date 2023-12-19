package impl;

public class X11TPro extends FactoryClass{
    @Override
    public IMobile factoryMethod() {
        return new Xiaomi11TPro();
    }

    @Override
    public String os() {
        return super.os();
    }
}
