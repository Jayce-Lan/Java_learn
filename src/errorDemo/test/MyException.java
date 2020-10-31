package errorDemo.test;

/**
 * @自定义异常
 */

public class MyException extends Exception {
    private int id;
    public MyException(String msg, int id) {
        super(msg);
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
