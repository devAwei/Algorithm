package com.awei.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Description: 二叉树
 * @Author: Awei
 * @Create: 2021-03-19 10:59
 **/
public class BinaryTree<T> {
    
    /**
    * @Description: 创建一个二叉树
    * @Param: [inputList]
    * @return: com.awei.tree.TreeNode<T>
    * @Author: Awei
    * @Date: 2021/3/19
    */
    public TreeNode<T> createBinaryTree(LinkedList<T> inputList) {
        TreeNode<T> node = null;
        if (null == inputList || inputList.isEmpty()) {
            return null;
        }
        T data = inputList.removeFirst();
        if (null != data) {
            node = new TreeNode<>(data);
            node.leftChild = createBinaryTree(inputList);
            node.rigthChild = createBinaryTree(inputList);
        }
        return node;
    }

    //中序遍历
    public void inOrderTraveral(TreeNode<T> node) {
        if (null == node) {
            return;
        }
        inOrderTraveral(node.leftChild);
        System.out.print(node.data+"+++    ");
        inOrderTraveral(node.rigthChild);
    }

    /**
     * 层序遍历  广度优先
     * @param root
     */
    public void levelOrderTraversal(TreeNode<T> root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode<T> node = queue.poll();
            System.out.print(node.data+"+++    ");
            if (null != node.leftChild) {
                queue.offer(node.leftChild);
            }
            if (null != node.rigthChild) {
                queue.offer(node.rigthChild);
            }
        }
        System.out.println();
    }

    public TreeNode<T> createBinaryTreeByArray(T[] arr, int index) {
        TreeNode<T> tn = null;
        if (index < arr.length&&null!=arr[index]) {
            tn = new TreeNode<>(arr[index]);
            tn.leftChild = createBinaryTreeByArray(arr, index * 2 + 1);
            tn.rigthChild = createBinaryTreeByArray(arr, index * 2 + 2);
            return tn;
        }
        return tn;
    }
}
