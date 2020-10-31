package TestString;

public class TestString1 {
    public static void main(String[] args) {
        String str = "AAABBBnnnccc________ &*";
        System.out.println(caseStr(str));
    }

    /**
     * 判断一个字符串中有多少个大小写以及非字母
     * @param str
     */
    public static String caseStr(String str) {
        int isLower = 0;
        int isCapital = 0;
        int notStr = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c >= 'a' && c <= 'z')
                isLower++;
            else if (c >= 'A' && c <= 'Z')
                isCapital++;
            else
                notStr++;
        }

        return "字符串" + str + "中，小写字母为：" + isLower
                + "个，大写字母为：" + isCapital + "个，非字母为：" + notStr + "个";
    }
}
