package ArrayDemo;

/**
 * @元素为引用类型的数组中的每一个元素都需要实例化
 */

public class TestArray2 {
    public static void main(String[] args) {
        Date[] days;
        days = new Date[3];

        for (int i = 0; i < 3; i++) {
            days[i] = new Date(2020, 10, 22 + i);
        }

        System.out.println(days.toString());
    }
}