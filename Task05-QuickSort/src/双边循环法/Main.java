package 双边循环法;

import java.util.Arrays;

/**
 * @Description:
 * @Author: Awei
 * @Create: 2021-04-21 08:36
 **/
public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 7, 3, 5, 6, 2, 8, 1};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    private static void quickSort(int[] arr, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }
        int pivot = patition(arr, startIndex, endIndex);
        quickSort(arr, startIndex, pivot - 1);
        quickSort(arr, pivot + 1, endIndex);
    }

    private static int patition(int[] arr, int startIndex, int endIndex) {
        int left = startIndex, right = endIndex, pivot = arr[startIndex];
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
        swap(arr, startIndex, left);
        return left;
    }

    private static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
/*
* 快速排序： 平均复杂度为 O(nlogn) ,最坏的时间复杂度为 O(n 平方)
*       属于不稳定排序
*       平均空间复杂度为 O(logn)
*
*/