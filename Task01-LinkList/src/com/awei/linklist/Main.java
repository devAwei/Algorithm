package com.awei.linklist;

/**
 * @Description: main function
 * @Author: Awei
 * @Create: 2021-03-19 14:29
 **/
public class Main {
    public static void main(String[] args) {
        //链表

        LinkList<String> linkList = new LinkList<>();
        String[] strs = new String[10];

        for (int i = 0; i < strs.length; i++) {
            strs[i] = i + "+++    ";
            linkList.insert(strs[i], i);
        }
        linkList.remove(4);

        linkList.output();
    }
}
