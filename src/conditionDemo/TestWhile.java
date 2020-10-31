package conditionDemo;

public class TestWhile {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            i++;
            System.out.println(i);
        }
        System.out.println("---------------------------");
        i = 0;
        do {
            i++;
            System.out.println(i);
        } while (i < 10);
    }
}
