import java.sql.SQLOutput;

public class Car {
    public String desc;
    protected int topSpeed;

    public Car(String desc, int topSpeed) {
        this.desc = desc;
        this.topSpeed = topSpeed;
    }

    public void startEngine() {
        System.out.println("Car -> startEngine");
        ;
    }

    public void drive() {
        runEngine();
        System.out.println("Car -> Driving, type is: " + getClass().getSimpleName());
    }

    protected void runEngine() {
        System.out.println("Car -> runEngine");
    }


    //factory method
    public static Car generateCar(String desc, String type, int topSpeed) {
        return switch (type.toUpperCase().charAt(0)) {
            case 'G' -> new GasPoweredCar(desc, topSpeed);
            case 'E' -> new ElectricCar(desc, topSpeed);
            case 'H' -> new HybridCar(desc, topSpeed);
            default -> new Car(desc, topSpeed);
        };
    }

}

class GasPoweredCar extends Car {
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String desc, int topSpeed) {
        this(desc, topSpeed, 70, 6);
    }

    public GasPoweredCar(String desc, int topSpeed, double avgKmPerLitre, int cylinders) {
        super(desc, topSpeed);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All % cylindewrs are fired up, Ready!%n", cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usage exceeds the average: %.2f %n", avgKmPerLitre);
    }
}

class ElectricCar extends Car {
    private double avgKmPerCharge;
    private int battery;

    public ElectricCar(String desc, int topSpeed) {
        this(desc, topSpeed, 30, 100);
    }

    public ElectricCar(String desc, int topSpeed, double avgKmPerCharge, int battery) {
        super(desc, topSpeed);
        this.avgKmPerCharge = avgKmPerCharge;
        this.battery = battery;
    }

    @Override
    public void startEngine() {
        System.out.printf("Electric engine starting up with %f battery level!%n", battery);
    }

    @Override
    protected void runEngine() {
        System.out.println("Electric engine is running silently.");
    }
}

class HybridCar extends Car {
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String desc, int topSpeed) {
        this(desc, topSpeed, 50, 100, 6);
    }

    public HybridCar(String desc, int topSpeed, double avgKmPerLitre, int batterySize, int cylinders) {
        super(desc, topSpeed);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("All %f cylinders are fired up, and the battery level is at %f%n", cylinders, batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.println("Hybrid engine runnin!");
    }
}
