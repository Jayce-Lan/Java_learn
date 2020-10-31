package ArrayDemo;

public class TestArray1 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        String strArr[] = new String[3];

        System.out.println(arr[3]);     //0
        System.out.println(strArr[2]);  //null
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        System.out.println(arr[3]); //0
    }
}
