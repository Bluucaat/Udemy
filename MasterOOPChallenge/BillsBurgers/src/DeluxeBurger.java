public class DeluxeBurger extends Hamburger {

    String menuItem1 = "Chips";
    double item1Price = 2.5;
    String menuItem2 = "Drink";
    double item2Price = 1.6;

    public DeluxeBurger() {
        super("deluxe", "BBQ Grilled Pork", 15, "White");

        System.out.println("Added " + menuItem1 + " for an extra " + item1Price);
        System.out.println("Added " + menuItem2 + " for an extra " + item2Price);
    }

    @Override
    public void addHamburgerAddition1(String addition1, double price1) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String addition2, double price2) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String addition3, double price3) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String addition4, double price4) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public double itemizeHamburger() {
        double totalPrice = this.getPrice() + item1Price + item2Price;
        System.out.printf("Total Deluxe Burger price is %.2f%n", totalPrice);
        return totalPrice;
    }

}
