package errorDemo.test;

public class Test {
    public void regist(int num) throws MyException {
        if (num < 0) {
            throw new MyException("人数为负，不合理", 3);   //抛出异常后程序就会终止
        }
        System.out.println("登记人数：" + num);
    }

    public void manager() {
        try {
            regist(-2);
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.manager();
    }
}
