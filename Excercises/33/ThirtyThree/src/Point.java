public class Point {
    private int x;
    private int y;

    public Point(){
        this(0, 0);
    }
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        return Math.sqrt((this.x * this.x) + (this.y * this.y));
    }

    public double distance(int x, int y){
        double distanceX = (double)(this.x - x);
        double distanceY = (double)(this.y -y);
      return Math.sqrt((distanceX * distanceX) +(distanceY * distanceY));
    }

    public double distance(Point p){
        double distanceX = (double)(this.x - p.getX());
        double distanceY = (double)(this.y - p.getY());
        return Math.sqrt((distanceX * distanceX) + (distanceY * distanceY));
    }
}
