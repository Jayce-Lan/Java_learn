package ArrayDemo;

public class TestDateSort {
    public static void main(String[] args) {
        Date date1 = new Date(2000, 10, 1);
        Date date2 = new Date(2003, 9, 30);
        Date date3 = new Date(1995, 6, 16);
        Date date4 = new Date(2020, 10, 24);
        Date date5 = new Date(2003, 9, 29);

        Date[] arr = {date1, date2, date3, date4, date5};

        print(arr);
        bubbleSort(arr);
//        System.out.println(bubbleSort(arr));
        print(arr);

        Date dateFind = new Date(1995, 6, 16);
        System.out.println(binarySearch(arr, dateFind));
    }

    /**
     * 冒泡排序：效率相比选择排序会更高
     * @param arr
     * @return 返回值为数组类型的方法
     */
    public static Date[] bubbleSort(Date[] arr) {
        Date temp;
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j <= i - 1; j ++) {
                if (arr[j].compare(arr[j+1]) > 0) {
                    temp = arr[j];
                    arr[j] = arr [j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    /**
     * 二分法查找对象
     * @param days  被查找对象数组
     * @param d 需要查找的元素
     * @return 如果存在，则返回对象数组下标，否则返回-1
     */
    public static int binarySearch(Date[] days, Date d) {
        if (days.length == 0)
            return -1;

        int startPos = 0;
        int endPos = days.length - 1;
        int m = (startPos + endPos) / 2;

        while (startPos <= endPos) {
            if (d.compare(days[m]) == 0)
                return m;
            if (d.compare(days[m]) > 0)
                startPos = m + 1;
            if (d.compare(days[m]) < 0)
                endPos = m - 1;

            m = (startPos + endPos) / 2;
        }

        return -1;
    }

    public static void print(Date[] dates) {
        for (int i = 0; i < dates.length; i++) {
            System.out.print(dates[i] + " ");
        }
        System.out.println();
    }
}
