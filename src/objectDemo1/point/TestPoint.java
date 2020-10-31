package objectDemo1.point;

public class TestPoint {
    public static void main(String[] args) {
        Point o = new Point(0, 0, 0);
        Point p1 = new Point(3.0, 4.0 ,5.0);
        System.out.println(p1.getDistance(o));
    }
}
