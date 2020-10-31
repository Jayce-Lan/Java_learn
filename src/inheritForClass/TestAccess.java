package inheritForClass;

public class TestAccess {
    public static void main(String[] args) {
        TT tt = new TT();
        tt.m();
    }
}

class T {
    private String str1 = "private str1";
            String str2 = "default str2";
    protected String str3 = "protected str3";
    public String str4 = "public str4";

    public void m() {
        System.out.println(this.str1);
    }
}

class TT {
    T t = new T();

    public void m() {
        t.m();
        System.out.println(t.str2);
    }
}
