package ArrayDemo;

public class NumSort {
    public static void main(String[] args) {
        int arr[] = {2,5,4,6,9,10,3};
        showArray(arr);
        selectionSort(arr);
        showArray(arr);
    }

    /**
     * 选择排序，但是效率不高，因为数组元素间会多次交换
     * @param arr
     */
    private static void selectionSort(int[] arr) {
        int temp;   //为了保证不用每次for循环都新开一个栈内存，因此，在开头先声明
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    private static void showArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
