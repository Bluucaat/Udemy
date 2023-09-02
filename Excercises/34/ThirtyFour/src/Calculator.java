public class Calculator {

    private Carpet carpet = new Carpet(2);
    private Floor floor = new Floor(2, 2);


    public Calculator(Floor floor, Carpet carpet) {

        this.carpet = carpet;
        this.floor = floor;


    }


    public double getTotalCost() {

        return floor.getArea() * carpet.getCost();


    }


}