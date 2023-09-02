public class Wall {


    private double width;
    private double height;

    public Wall() {

        System.out.println("empty constructor called");

    }

    public Wall(double width, double height) {

        this.width = width;
        this.height = height;

        if (width < 0) {

            width = 0;
            this.width = width;

        }

        if (height < 0) {

            height = 0;
            this.height = height;

        }

    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
        if (width < 0) {

            width = 0;
            this.width = width;
        }
    }

    public void setHeight(double height) {
        this.height = height;

        if (height < 0) {

            height = 0;
            this.height = height;

        }
    }

    public double getArea() {
        return height * width;
    }

}

