import java.util.Arrays;

/**
 * @Description: 计数排序
 * @Author: Awei
 * @Create: 2021-04-24 14:07
 **/
public class Main {
    public static void main(String[] args) {
        int[] arr = {95, 94, 91, 98, 99,84,89, 90, 99, 93, 91, 92};
        int[] arrResult = countSort(arr);
        System.out.println(Arrays.toString(arrResult));
    }

    private static int[] countSort(int[] arr) {
        int max = arr[0], min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        //遍历数列，填充统计数组
        int[] countArray = new int[max - min + 1];
        for (int i = 0; i < arr.length; i++) {
            countArray[arr[i] - min]++;
        }

        //遍历统计数组，输出结果
        int[] sortedArray = new int[arr.length];
        int index = 0;
        for (int i = 0; i < countArray.length; i++) {
            for (int j = 0; j < countArray[i]; j++) {
                sortedArray[index++]=i+min;
            }
        }
        return sortedArray;
    }
}
