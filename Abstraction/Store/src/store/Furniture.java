package store;

public class Furniture extends ProductForSale{
    public Furniture(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    void showDetails() {
        System.out.println("This " + type + " was manufactered in Hungary.");
        System.out.printf("The price of the piece is $%6.2f %n", price);
        System.out.println(description);
    }
}
