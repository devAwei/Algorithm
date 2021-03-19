package com.awei.linklist;

/**
 * @Description: 结点
 * @Author: Awei
 * @Create: 2021-03-19 10:18
 **/
public class Node<T> {
    T data;
    Node<T> next;


    public Node(T data) {
        this.data = data;
    }
}
