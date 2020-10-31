package TestIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestTransForm2 {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = null;

        try {
            s  = br.readLine();
            while (s != null) {
                //比较这 String到另一个 String，忽略问题的考虑。
                if (s.equalsIgnoreCase("exit"))
                    break;
                //.toUpperCase()转换成大写
//                System.out.println(s.toUpperCase());
                System.out.println(s);
                s = br.readLine();
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
