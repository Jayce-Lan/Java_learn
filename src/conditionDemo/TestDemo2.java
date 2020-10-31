package conditionDemo;

//判断101-200为质数的数：只能被1和自身整除

public class TestDemo2 {
    public static void main(String[] args) {
        for (int i = 101; i < 200; i += 2) {
            boolean f = true;   //假定为真
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    f = false;
                    break;
                }
            }
            if (!f) {
                continue;   //当f=false的时候，会跳出当前循环
            }
            System.out.print(i + ",");
        }
    }
}
