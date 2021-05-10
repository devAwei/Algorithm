package com.awei.tree;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @Description: main function
 * @Author: Awei
 * @Create: 2021-03-19 14:30
 **/
public class Main {
    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        LinkedList<Integer> inputList = new LinkedList<Integer>(Arrays.asList(new Integer[]{3, 2, 9, null, null, 10, null, null, 8, null, 4}));
        TreeNode<Integer> treeNode = binaryTree.createBinaryTree(inputList);
        // 数组初始化 bug
        treeNode = binaryTree.createBinaryTreeByArray(new Integer[]{3, 2, 9, null, null, 10, null, null, 8, null, 4}, 0);
        System.out.println("=====中序遍历=====");
        binaryTree.inOrderTraveral(treeNode);
        System.out.println("\n=====广度优先遍历=====");
        binaryTree.levelOrderTraversal(treeNode);
    }
}
