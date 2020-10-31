package testEnum;

public class TestEnum {
    public enum MyColor {red, blue, yello}

    public static void main(String[] args) {
        MyColor m = MyColor.red;

        switch (m) {
            case red:
                System.out.println("I'm red");
                System.out.println(m);      //red
                break;
            case blue:
                System.out.println("I'm blue");
                break;
            case yello:
                System.out.println("I'm yello");
                break;
            default:
                System.out.println("I'm default");
        }
    }
}
