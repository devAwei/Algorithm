package com.awei.binaryheap;

import java.util.Arrays;

/**
 * @Description: main function
 * @Author: Awei
 * @Create: 2021-03-19 16:39
 **/
public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1,3,2,6,5,7,8,9,10,0};
        BinaryHeap.upAdjust(array);
        System.out.println(Arrays.toString(array));
        int[] arr = new int[]{7, 1, 3, 10, 5, 2, 8, 9, 6};
        BinaryHeap.buildHeap(arr);
        System.out.println(Arrays.toString(arr));
    }

}
