public class Main {
    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.5, "White");
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        hamburger.addHamburgerAddition4("Egg", 1.23);

        hamburger.itemizeHamburger();

        DeluxeBurger deluxeburger = new DeluxeBurger();
        deluxeburger.addHamburgerAddition1("Lettuce", 0.23);
        deluxeburger.itemizeHamburger();

        HealthyBurger healthyBurger = new HealthyBurger("Fish", 20);
        healthyBurger.addHealthyAddition1("POOP", 10);
        healthyBurger.itemizeHamburger();

    }
}
