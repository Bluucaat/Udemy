public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("HealthBurger", meat, price, "Brown");
    }

    public void addHealthyAddition1(String addition1, double price1) {
        this.healthyExtra1Name = addition1;
        this.healthyExtra1Price = price1;
        System.out.println("Added " + addition1 + " for an extra " + price1);
    }

    public void addHealthyAddition2(String addition2, double price2) {
        this.healthyExtra2Name = addition2;
        this.healthyExtra2Price = price2;
        System.out.println("Added " + addition2 + " for an extra " + price2);
    }

    @Override
    public double itemizeHamburger() {

        if (this.healthyExtra1Name == null && this.healthyExtra2Name == null) {
            double currPrice = this.getPrice();
            System.out.printf("Total Healthy Burger price is %.2f%n", currPrice);
            return this.getPrice();

        } else if (this.healthyExtra2Name == null) {
            double currPrice = this.getPrice() + healthyExtra1Price;
            System.out.printf("Total Healthy Burger price is %.2f%n", currPrice);
            return currPrice;

        } else {
            double currPrice = this.getPrice() + healthyExtra1Price + healthyExtra2Price;
            System.out.printf("Total Healthy Burger price is %.2f%n", currPrice);
            return currPrice;

        }


    }
}
