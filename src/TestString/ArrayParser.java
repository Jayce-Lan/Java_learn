package TestString;

public class ArrayParser {
    public static void main(String[] args) {
        String str = "1,2;3,4,5;6,7,8";
        arrParser(str);
    }

    public static void arrParser(String str) {
        String[] sFirst = str.split(";");
        double[][] d;
        d = new double[sFirst.length][];

        for (int i = 0; i < sFirst.length; i++) {
            String[] sScond = sFirst[i].split(",");
            d[i] = new double[sScond.length];
            for (int j = 0; j < sScond.length; j++) {
                d[i][j] = Double.parseDouble(sScond[j]);
            }
        }

        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                System.out.print("d[" + i + "][" + j + "]:" + d[i][j] + " ");
            }
            System.out.println();
        }
    }
}
