public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;
    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        System.out.printf( "%s hamburger on a %s roll with %s price is %.2f%n", name, breadRollType, meat, price);
    }

    public void addHamburgerAddition1(String addition1, double price1) {
        this.addition1Name = addition1;
        this.addition1Price = price1;
        System.out.println("Added " + addition1 + " for an extra " + price1);
    }

    public void addHamburgerAddition2(String addition2, double price2) {
        this.addition2Name = addition2;
        this.addition2Price = price2;
        System.out.println("Added " + addition2 + " for an extra " + price2);
    }

    public void addHamburgerAddition3(String addition3, double price3) {
        this.addition3Name = addition3;
        this.addition3Price = price3;
        System.out.println("Added " + addition3 + " for an extra " + price3);
    }

    public void addHamburgerAddition4(String addition4, double price4) {
        this.addition4Name = addition4;
        this.addition4Price = price4;
        System.out.println("Added " + addition4 + " for an extra " + price4);
    }

    public double getPrice() {
        return price;
    }

    public double itemizeHamburger() {
        double totalPrice = 0.0;
        if (this.addition4Name == null && this.addition3Name == null
                && this.addition2Name == null && this.addition1Name == null)
        {
            System.out.println("Total burger price is " + this.price);
            return this.price;
        }
        else if (this.addition4Name == null && this.addition3Name == null
                && this.addition2Name == null)
        {
            double currPrice = this.price + addition1Price;
            System.out.printf("Total burger price is %.2f%n", currPrice);
            return (currPrice);
        }
        else if (this.addition4Name == null && this.addition3Name == null)
        {
            double currPrice = this.price + addition1Price + addition2Price;
            System.out.printf("Total burger price is %.2f%n", currPrice);
            return (currPrice);
        }
        else if (this.addition4Name == null) {
            double currPrice = this.price + addition1Price + addition2Price + addition3Price;
            System.out.printf("Total burger price is %.2f%n", currPrice);
            return (currPrice);

        } else {
            double currPrice = this.price + addition1Price + addition2Price + addition3Price + addition4Price;
            System.out.printf("Total burger price is %.2f%n", currPrice);
            return (currPrice);
        }
    }
}
