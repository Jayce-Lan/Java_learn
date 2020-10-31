package ArrayDemo;

/**
 * @有一群人，手牵手围成圆圈，第一个人开始数数，每数到3就退出一个
 * 往下的人从1开始，以此类推，数到最后只剩一个人结束，最后剩下的人是谁
 */

public class Count3Quit {
    public static void main(String[] args) {
        boolean[] person = new boolean[500];

        //给数组赋值，每个均为true
        for (int i = 0; i < person.length; i++) {
            person[i] = true;
        }

        int l = person.length;  //记录剩余人数
        int countNum = 0;   //记录每次数数
        int index = 0;      //记录数组下标

        while (l > 1) {
            if(person[index] == true) {
                countNum++;
                if (countNum == 3) {
                    countNum = 0;
                    person[index] = false;
                    l--;
                }
            }

            index++;

            //当回到第一个人时，循环继续
            if (index == person.length) {
                index = 0;
            }
        }

        for (int i = 0; i < person.length; i++) {
            if (person[i] == true) {
                System.out.println(i + 1);
            }
        }
    }
}
