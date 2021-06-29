/*
 * @Author: KingWJC
 * @Date: 2021-06-29 16:26:41
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-06-29 17:19:34
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\iterator\ArrayListCus.java
 * 
 * 手写一个动态扩展的容器
 * 相比数组，这个容器不用考虑边界问题，可以动态扩展
 * 
 */
package iterator;

public class ArrayListCus implements CollectionCus {
    // 使用数组作为物理存储结构
    Object[] list = new Object[10];
    // 记录数组当前空位置的索引，以及数组长度
    int index;

    public int size() {
        return index;
    }

    public void add(Object obj) {
        if (index == list.length) {
            Object[] newList = new Object[list.length * 2];
            System.arraycopy(list, 0, newList, 0, list.length);
            list = newList;
        }

        list[index] = obj;
        index++;
    }

    @Override
    public IteratorCus iterator() {
        return new ArrayListCusIterator();
    }

    private class ArrayListCusIterator implements IteratorCus {
        // 指针
        int current = 0;

        @Override
        public boolean hasNext() {
            return current < index;
        }

        @Override
        public Object next() {
            Object next = list[current];
            current++;
            return next;
        }
    }
}
