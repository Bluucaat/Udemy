public class Ford extends Car{
    @Override
    public String startEngine() {
        return super.startEngine();
    }

    @Override
    public String accelerate() {
        return super.accelerate();
    }

    @Override
    public String brake() {
        return super.brake();
    }

    public Ford(int cylinders, String name) {
        super(cylinders, name);


    }
}
