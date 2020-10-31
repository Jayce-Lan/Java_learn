package hello;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        guessNum(0);
    }

    private static void guessNum(int inputNum) {
        int randomNum = Math.round((int) (Math.random() * 100));
        int count = 1;
        Scanner sc = new Scanner(System.in);


        System.out.print("系统生成了一个0-100的整数，请你猜猜是几：");
        inputNum = sc.nextInt();

        while (inputNum != randomNum) {
            if (inputNum > randomNum) {
                System.out.println("输入数字过大，请重新输入！");
                inputNum = sc.nextInt();
                count++;
            } else {
                System.out.println("输入数字过小，请重新输入！");
                inputNum = sc.nextInt();
                count++;
            }
        }

        System.out.println("经过" + count + "次，回答正确，数字为：" + randomNum);

        for (int i = 0; i <= 10; i++) {
            System.out.println();
        }

        guessNum(0);
    }
}