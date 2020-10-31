/**
 * 变量
 * 作者：Jayce
 * 日期：2020.09.02
 */

public class VariableDemo {
    public static void main(String[] args) {
        int num1, num2, num3;
        String str1 = "三个数字分别为：";
        num1 = 1;
        num2 = 2;
        num3 = 3;
        System.out.println(str1 + num1 + num2 + num3);
        str1 = "三个数字的和为：";
        System.out.println(str1 + (num1 + num2 + num3));

        //浮点数
        double dnum1 = 12.5;
        float fnum1 = 12.5f;    //如果为12.5会报错 不兼容的类型: 从double转换到float可能会有损失
        System.out.println(fnum1 == dnum1); //true

        //byte
        byte bnum1 = -128;
        System.out.println("浮点数btye：" + bnum1);

//        byte bnum2 = 128;     //会报错，因为byte为-128-127
//        System.out.println("浮点数btye：" + bnum2);

    }
}
