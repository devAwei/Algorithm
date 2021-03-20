package com.awei.bubblesort;

import java.util.Arrays;

/**
 * @Description: 冒泡排序
 * @Author: Awei
 * @Create: 2021-03-20 12:38
 **/
public class SortMain {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 8, 6, 3, 9, 2, 1, 7};
        System.out.println(Arrays.toString(bubbleSort(arr)));
        int[] array = new int[]{2,3,4,5,6,7,8,1};
        System.out.println(Arrays.toString(cockTailSort(array)));

    }

    private static int[] bubbleSort(int[] arr) {
        int sortBorder = arr.length - 1;
        int lastExchangeIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isSorted = true;
            for (int j = 0; j < sortBorder; j++) {
                int temp = 0;
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted = false;
                    lastExchangeIndex = j;
                }
            }
            sortBorder = lastExchangeIndex;
            if (isSorted) break;
        }
        return arr;
    }


    private static int[] cockTailSort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            boolean isSorted = true;
            for (int j = i; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted = false;
                }
            }
            if (isSorted) break;
            isSorted = true;
            for (int j = arr.length - i - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    isSorted = false;
                }
            }
            if(isSorted) break;
        }
        return arr;
    }
}
