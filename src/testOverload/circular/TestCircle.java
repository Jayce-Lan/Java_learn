package testOverload.circular;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(new Point(1.0, 2.0), 2.0);
        Circle c2 = new Circle(5.0);
        System.out.println("c1:(" + c1.getO().getX() + ", " + c1.getO().getY() + "), " + c1.getRadius());
        System.out.println("该点是否在圆内:" + (c1.contains(new Point(2.0, 2.0)) ? "是" : "否"));
        System.out.println("c1的面积" + c1.area());
    }
}
