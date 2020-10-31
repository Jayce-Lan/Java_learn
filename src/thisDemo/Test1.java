package thisDemo;

public class Test1 {
    int i;

    Test1 demo() {
        i++;
        System.out.println(this);
        return this;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public static void main(String[] args) {
        Test1 ts = new Test1();
        ts.setI(10);
        ts.demo();
    }
}
