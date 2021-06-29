/*
 * @Author: KingWJC
 * @Date: 2021-06-29 16:41:12
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-06-29 16:41:13
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\iterator\CollectionCus.java
 */
package iterator;

public interface CollectionCus {
    int size();
    void add(Object obj);
    IteratorCus iterator();
}