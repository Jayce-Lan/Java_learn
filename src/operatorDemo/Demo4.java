package operatorDemo;
//三目运算符
public class Demo4 {
    public static void main(String[] args) {
        int score = 77;
        int num = -100;

        String flag = score < 60 ? "不及格！" : "已及格！";
        int isNum = num > 0 ? 1 : (num == 0 ? 0 : -1);

        System.out.println(flag);
        System.out.println(isNum);

    }
}
