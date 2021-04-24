package com.awei.tree;

/**
 * @Description: 数的结点
 * @Author: Awei
 * @Create: 2021-03-19 10:57
 **/
public class TreeNode<T> {
    T data;
    TreeNode<T> leftChild;
    TreeNode<T> rigthChild;

    public TreeNode(T data) {
        this.data = data;
    }

}
