package conditionDemo;

public class TestDemo1 {
    public static void main(String[] args) {
        //打印0-100前五个可以被3整除的数
        int count = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
                count++;
            }
            if (count == 3)
                break;
        }
    }
}
