package com.awei.linklist;


/**
 * @Description: 链表
 * @Author: Awei
 * @Create: 2021-03-19 10:20
 **/
public class LinkList<T> {
    //头节点
    private Node<T> head;
    //尾节点
    private Node<T> last;
    //链表大小
    private int size;
    
    /**
    * @Description: 根据链表索引 获取节点
    * @Param: [index]
    * @return: com.awei.task.Node<T>
    * @Author: Awei
    * @Date: 2021/3/19
    */
    public Node<T> get(int index) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException("超出链表节点范围");
        }
        Node<T> temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }


    /**
    * @Description: 链表插入元素
    * @Param: [data, index]
    * @return: void
    * @Author: Awei
    * @Date: 2021/3/19
    */
    public void insert(T data, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("超出链表节点范围");
        }
        Node<T> insertedNode = new Node<>(data);
        if (index == 0) {
            //头部插入
            head = insertedNode;
            last = insertedNode;
        } else if (index == size) {
            //尾部插入
            last.next = insertedNode;
            last = insertedNode;
        } else {
            //中间插入
            Node<T> prevNode = get(index - 1);
            insertedNode.next = prevNode.next;
            prevNode.next = insertedNode;
        }
        size++;
    }

    public Node<T> remove(int index) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException("超出链表节点范围");
        }
        Node<T> removeNode = null;
        if (index == 0) {
            //删除头节点
            removeNode = head;
            head = head.next;
        } else if (index == size - 1) {
            //删除尾节点
            Node<T> prevNode = get(index - 1);
            removeNode = prevNode.next;
            prevNode.next = null;
            last = prevNode;
        } else {
            //删除中间节点
            Node<T> prevNode = get(index - 1);
            removeNode = prevNode.next;
            prevNode.next = prevNode.next.next;

        }
        size--;
        return removeNode;

    }

    /**
    * @Description: 输出链表
    * @Param: []
    * @return: void
    * @Author: Awei
    * @Date: 2021/3/19
    */
    public void output() {
        Node<T> temp = head;
        while (null != temp) {
            System.out.print(temp.data);
            temp = temp.next;
        }
        System.out.println();
    }

}
