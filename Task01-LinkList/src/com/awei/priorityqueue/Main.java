package com.awei.priorityqueue;

/**
 * @Description: 最大有限队列 主函数
 * @Author: Awei
 * @Create: 2021-03-22 09:18
 **/
public class Main {
    public static void main(String[] args) throws Exception {
        int[] arr = new int[]{3, 2, 1, 5, 6, 7, 8, 9};
        PriorityQueue queue = new PriorityQueue();
        for (int i = 0; i < arr.length; i++) {
            queue.enQueue(arr[i]);
        }

        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());

    }
}
