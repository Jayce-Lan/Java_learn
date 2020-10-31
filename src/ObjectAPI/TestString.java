package ObjectAPI;

public class TestString {
    public static void main(String[] args) {
        String str1 = new String("test");
        String str2 = new String("test");

        String str3 = "test";
        String str4 = "test";

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));

        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));
    }
}
