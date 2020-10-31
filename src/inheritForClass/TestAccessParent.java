package inheritForClass;

/**
 * @private: 即使是在继承的类中，子类也不能直接访问该权限下的变量
 */

public class TestAccessParent {
    public static void main(String[] args) {
        Tb tb = new Tb();
        tb.m();
    }
}

class Ta {
    private String str1 = "private str1";
    String str2 = "str2";
}

class Tb extends Ta {
    public void m() {
        System.out.println(str2);
    }
}