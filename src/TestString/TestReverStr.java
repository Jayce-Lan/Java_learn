package TestString;

public class TestReverStr {
    public static void main(String[] args) {
        String str = "Hello World!";
        reverStr(str);
        System.out.println();
    }

    public static void reverStr(String str) {
        if (str.length() == 0 || str == null)
            System.out.println("空字符串！");
        else {
            char[] c = str.toCharArray();

            System.out.print(str + "经过倒序后为：");

            for (int i = c.length - 1; i >= 0; i--) {
                System.out.print(c[i]);
            }
        }
    }
}
