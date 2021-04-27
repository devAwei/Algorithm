package 单边循环法;

import java.util.Arrays;

/**
 * @Description:
 * @Author: Awei
 * @Create: 2021-04-21 08:36
 **/
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 10; i > 0; i--) {
            arr[arr.length - i] = i;
        }
        System.out.println(Arrays.toString(arr));
        int start = 0, end = arr.length-1;
        quickSort(arr, start, end);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int start, int end) {
        if(start>=end) return;
        int pivot = patition(arr, start, end);
        quickSort(arr, start, pivot - 1);
        quickSort(arr, pivot + 1, end);
    }

    private static int patition(int[] arr, int start, int end) {
        int mark = start;
        int pivot = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] < pivot) {
                mark++;
                swap(arr, i, mark);
            }
        }
        swap(arr, start, mark);
        return mark;
    }

    /**
     * 数组 交换 left right 下标的 值
     * @param arr
     * @param left
     * @param right
     */
    private static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
