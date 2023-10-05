package bluu.cat;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("German shepherd", "big", 100);
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(new Fish("Goldfish", "small", 1));
        animals.add(new Fish("Barracuda", "small", 2));
        animals.add(new Horse("Clydesdale", "large", 1000));

        for(Animal animal: animals){
            doAnimalStuff(animal);
            if(animal instanceof Mammal currentMammal){
                currentMammal.shedHair();
            }
        }

    }

    private static void doAnimalStuff(Animal animal){
        animal.makeNoise();
        animal.move("slow");
    }
}
