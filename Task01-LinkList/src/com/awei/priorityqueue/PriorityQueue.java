package com.awei.priorityqueue;

import sun.nio.cs.ext.TIS_620;

import javax.crypto.Cipher;
import java.util.Arrays;
import java.util.Timer;

/**
 * @Description: 最大 优先队列
 * @Author: Awei
 * @Create: 2021-03-22 08:54
 **/
public class PriorityQueue {
    // 存储最大堆的 数组
    private int[] array;
    //最大堆的长度
    private int size;


    public PriorityQueue() {
        array = new int[16];
        size = 0;
    }

    /**
     * 入队
     *
     * @param key
     */
    public void enQueue(int key) {
        if (size >= array.length) {
            //存不下， 扩容
            resize();
        }
        array[size++] = key;
        upAdjust();
    }

    public void upAdjust() {
        int child = size - 1;
        int parent = (child - 1) / 2;
        int temp = this.array[child];
        while (child > 0 && temp > this.array[parent]) {
            this.array[child] = this.array[parent];
            child = parent;
            parent = (child - 1) / 2;
        }
        this.array[child] = temp;
    }

    public int deQueue() throws Exception {
        if (size <= 0) {
            throw new Exception("队空，无法出队");
        }
        int head = this.array[0];
        this.array[0] = this.array[--size];
        downAdjust();
        return head;
    }


    private void downAdjust() {
        int parrent = 0;
        int child = parrent * 2 + 1;
        int temp = this.array[parrent];
        while (child < size) {
            if (child + 1 < size && this.array[child] < this.array[child + 1]) {
                child++;
            }
            if(temp>=this.array[child]) break;
            array[parrent] = array[child];
            parrent = child;
            child = parrent * 2 + 1;
        }
        array[parrent] = temp;

    }

    private void resize() {
        int newSize = this.size * 2;
        this.array = Arrays.copyOf(this.array, newSize);
    }

}
