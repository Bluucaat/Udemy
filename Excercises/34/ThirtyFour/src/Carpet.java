public class Carpet {
    private double cost;


    public Carpet(double cost) {
        System.out.println("Completed Carpet constructor called");
        this.cost = cost;


        if (cost < 0) {
            cost = 0;
            this.cost = cost;
        }


    }


    public double getCost() {
        return cost;
    }


}