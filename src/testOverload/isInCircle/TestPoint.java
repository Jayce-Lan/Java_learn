package testOverload.isInCircle;

public class TestPoint {
    public static void main(String[] args) {
        Point o = new Point(5.0, 4.0);
        Point p1 = new Point(5.0, 5.0);
        Circle c1 = new Circle(o, 10.0);

        System.out.println("是否在圆内：" + (c1.isInCircle(new Point(4.0, 4.0)) ? "是" : "否"));
    }
}
