package ArrayDemo;

/**
 * @二分法查找数组内元素
 * 查找数组内元素最快的方式，是将数组排序后用二分法进行查找
 */

public class TestSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(binarySearch(arr, 7));
    }

    /**
     * 两分法查找数组
     * 旨在假定中间数为被查询对象，前提是数组对象一定被由小到大排序过了。
     * @param arr 被查找数组
     * @param num 被查询数字
     * @return  如果存在，则返回数组下标，如果不存在，则返回-1
     */
    public static int binarySearch(int[] arr, int num) {
        if (arr.length == 0)
            return -1;
        int startPos = 0;               //获取数组下标起始值
        int endPos = arr.length - 1;    //获取数组下标结束值
        //二分法，找寻中间数
        int m = (startPos + endPos) / 2;

        while (startPos <= endPos) {
            if (num == arr[m])
                return m;

            if (num > arr[m]) {
                startPos = m + 1;
            }

            if (num < arr[m]) {
                endPos = m - 1;
            }

            m = (startPos + endPos) / 2;    //一次两分未查询到，在被两分的基础上继续两分
        }

        return -1;
    }
}
