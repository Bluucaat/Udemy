package bluu.cat;

public class Fish extends Animal {


    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        switch(speed){
            case "slow" -> System.out.println("The " + getExplicitType() + " is lazily swimming");
            case "fast" -> System.out.println("The " + getExplicitType() + " is swimming quickly");
        }

    }

    @Override
    public void makeNoise() {

        if (type.equalsIgnoreCase("goldfish")) {
            System.out.print("Swish! ");
        } else {
            System.out.print("Splash ");
        }
    }
}
