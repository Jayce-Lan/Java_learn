package testOverload.circular;

public class Point {
    private double x;
    private double y;

    public Point(double _x, double _y) {
        x = _x;
        y = _y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
