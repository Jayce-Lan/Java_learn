package conditionDemo;

public class ForDemo1 {
    public static void main(String[] args) {
        //计算0-100中奇数的和
        int sum = 0;
        for (int i = 1; i <= 100; i += 2) {
            sum += i;
        }
        System.out.println(sum);
    }
}
