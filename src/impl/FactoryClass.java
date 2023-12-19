package impl;

public abstract class FactoryClass {

    public abstract IMobile factoryMethod();

    public String os(){
        return "Android";
    }
}

