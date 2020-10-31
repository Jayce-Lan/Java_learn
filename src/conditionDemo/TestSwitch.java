package conditionDemo;

public class TestSwitch {
    public static void main(String[] args) {
        int i = 9;
        //switch中判断的值一定是int类型（或者可以被转换成int类型的值）
        switch (i) {
            case 1:
            case 2:
            case 7:
                System.out.println("A");
                break;
            case 9:
            case 10:
                System.out.println("B");
                break;
            default:
                System.out.println("other");
        }
    }
}
