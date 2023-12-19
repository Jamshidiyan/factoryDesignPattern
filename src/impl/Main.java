package impl;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        FactoryClass mobilenew = new X11TPro();
        System.out.println(mobilenew.os() + "\n" + mobilenew.factoryMethod().screen());
        FactoryClass mobilenew2 = new XNote10();
        System.out.println(mobilenew2.os() + "\n" + mobilenew2.factoryMethod().screen());
    }
}
