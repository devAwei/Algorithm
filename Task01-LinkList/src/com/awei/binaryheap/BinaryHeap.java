package com.awei.binaryheap;

/**
 * @Description: 二叉堆
 * @Author: Awei
 * @Create: 2021-03-19 14:14
 **/
public class BinaryHeap {


    /**
     * 上浮  插入一个结点
     * @param array
     */
    public static  void upAdjust(int[] array) {
        int childIndex = array.length - 1;
        int parentIndex = (childIndex - 1) / 2;
        int temp = array[childIndex];
        while (childIndex > 0 && array[parentIndex] > temp) {
            array[childIndex] = array[parentIndex];
            childIndex = parentIndex;
            parentIndex = (childIndex - 1) / 2;
        }
        array[childIndex] = temp;
    }

    /**
     * 下沉
     * @param array
     * @param parentIndex
     * @param length
     */
    public static void downAdjust(int[] array, int parentIndex,int length) {
        int temp = array[parentIndex];
        int child = parentIndex * 2 + 1;
        while (child < length) {
            if (child + 1 < length && array[child + 1] < array[child]) {
                // 如果有右孩子，且右孩子小于左孩子的值，则定位到右孩子
                child++;
            }
            if (array[child] >= temp) {
                break;
            }
            array[parentIndex] = array[child];
            parentIndex = child;
            child = parentIndex * 2 + 1;
        }
        array[parentIndex] = temp;
    }

    /**
     * 构建 二叉堆
     * @param array
     */
    public static void buildHeap(int[] array) {
        for (int i = (array.length - 2) / 2; i > 0; i--) {
            downAdjust(array,i, array.length);
        }
    }

}
