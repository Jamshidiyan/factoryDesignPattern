package impl;

public class XNote10 extends FactoryClass{
    @Override
    public IMobile factoryMethod() {
        return new XiaomiNote10();
    }

    @Override
    public String os() {
        return super.os();
    }
}
