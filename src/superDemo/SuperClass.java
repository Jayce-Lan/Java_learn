package superDemo;

public class SuperClass {
    private int n;

    SuperClass() {
        System.out.println("Super Class");
    }

    SuperClass(int n) {
        System.out.println("SuperClass(" + n + ")");
        this.n = n;
    }
}
