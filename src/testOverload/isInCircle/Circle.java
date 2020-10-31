package testOverload.isInCircle;

public class Circle {
    private Point o;
    private double r;

    public Circle(double _r) {
        o = new Point(0, 0);
        this.r = _r;
    }

    public Circle(Point p, double r) {
        o = p;
        r = r;
    }

    public boolean isInCircle(Point p) {
        double x = p.getX() - o.getX();
        double y = p.getY() - o.getY();
        if (x * x + y * y > r * r) {
            return false;
        } else {
            return true;
        }
    }

    public void setO(double x, double y) {
        o.setX(x);
        o.setY(y);
    }
}
