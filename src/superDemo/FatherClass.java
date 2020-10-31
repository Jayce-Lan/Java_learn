package superDemo;

public class FatherClass {
    public int value;
    public void f() {
        this.value = 100;
        System.out.println("FatherValue = " + this.value);
    }
}