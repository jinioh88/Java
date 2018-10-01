package decorator;

public class CoffeeShop {
    public static void main(String[] args) {
        Beverage beverage1 = new DarkRoast();
        System.out.println(beverage1.getDescription());

        Beverage beverage2 = new Espresso();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription());
    }
}
