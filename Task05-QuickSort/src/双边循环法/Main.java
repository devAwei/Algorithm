package 双边循环法;

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
        if (start > end) {
            return;
        }
        int pivot = patition(arr, start, end);
        quickSort(arr, start, pivot - 1);
        quickSort(arr, pivot + 1, end);
    }

    private static int patition(int[] arr, int start, int end) {
        int left = start, right = end;
        int pivot = arr[start];
        while (left != right) {
            while (left < right && arr[right] > pivot) {
                right--;
            }

            while (left < right && arr[left] <= pivot) {
                left++;
            }

            if (left < right) {
                swap(arr, left, right);
            }
        }
        swap(arr,start,left);
        return left;
    }

    private static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
