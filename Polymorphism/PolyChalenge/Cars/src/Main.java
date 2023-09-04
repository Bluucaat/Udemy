public class Main {
    public static void main(String[] args) {

       Car car1 = Car.generateCar("Ford Mustang", "GasPowered", 250);
       car1.runEngine();
       Car car2 = Car.generateCar("Tesla model S", "Electric", 260);
       car2.runEngine();

       runRace(car1, car2);
    }

    public static void runRace(Car car, Car car2){
        if(car.topSpeed > car2.topSpeed) System.out.printf("%s has won the race %n", car.desc);
        else System.out.printf("%s has won the race!%n", car2.desc);
    }

}
