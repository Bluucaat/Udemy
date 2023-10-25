package bluu.cat;

public class Dog extends Mammal {


    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        switch(speed){
            case "slow" -> System.out.println("The " + getExplicitType() + " is walking");
            case "fast" -> System.out.println("The " + getExplicitType() + " is running");
        }

    }

    @Override
    public void shedHair() {
        System.out.println(getExplicitType() + " shed hair all the time");
    }

    @Override
    public void makeNoise() {

        if (type.equalsIgnoreCase("wolf")) {
            System.out.print("Howling! ");
        } else {
            System.out.print("Woof! ");
        }
    }
}
