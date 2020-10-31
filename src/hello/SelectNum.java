package hello;

import java.util.Scanner;

public class SelectNum {
    public static void main(String[] args) {
        int inputNum;
        int randomNum = (int) Math.round(Math.random() * 100);
        int count = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println(randomNum);
        System.out.print("请输入一个0-100的数字");
        inputNum = sc.nextInt();

        while (inputNum != randomNum) {
            count++;
            if (inputNum > randomNum)
                System.out.println("输入数组过大，请重新输入！");
            else
                System.out.println("输入数组过小，请重新输入！");

            inputNum = sc.nextInt();
        }
        System.out.println("恭喜您！经过" + count + "次，输入成功！");
    }
}
