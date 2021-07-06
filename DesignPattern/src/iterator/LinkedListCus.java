/*
 * @Author: KingWJC
 * @Date: 2021-06-29 16:38:11
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-06-29 17:43:18
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\iterator\LinkedListCus.java
 * 
 * 手写一个动态扩展的容器
 * 使用链表作为物理存储结构
 * 
 */
package iterator;

public class LinkedListCus implements CollectionCus {

    // 容器第一个元素
    private Node head;
    // 容器最后一个元素
    private Node tail;
    // 容器长度
    private int size;

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(Object obj) {
        Node data = new Node(obj);
        data.setNext(null);

        if (head == null) {
            head = data;
            tail = data;
        }

        tail.setNext(data);
        tail = data;
        size++;
    }

    @Override
    public IteratorCus iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements IteratorCus {
        int currentIndex;
        Node currentNode = head;

        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public Object next() {
            Node node = currentNode;
            currentNode = node.next;
            currentIndex++;
            return node;
        }

    }

    private class Node {
        private Object value;
        private Node next;

        public void setNext(Node node) {
            this.next = node;
        }

        public Node(Object obj) {
            this.value = obj;
        }

        @Override
        public String toString() {
            return value.toString();
        }
    }

}