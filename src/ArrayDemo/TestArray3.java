package ArrayDemo;

public class TestArray3 {
    public static void main(String[] args) {
        int arr[];
        arr = new int[3];
        arr[0] = 1; arr[1] = 2; arr[2] = 3;

        Date days[];
        days = new Date[3];
        days[0] = new Date(2020, 10, 22);
        days[1] = new Date(2020, 10, 23);
        days[2] = new Date(2020, 10, 24);

        for (int i = 0; i < days.length; i++) {
//            System.out.print(days[i] + " ");
        }

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
