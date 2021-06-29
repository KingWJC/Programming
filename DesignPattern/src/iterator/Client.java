/*
 * @Author: KingWJC
 * @Date: 2021-06-29 17:03:05
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-06-29 17:44:02
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\iterator\Client.java
 */
package iterator;

public class Client {
    public static void main(String[] args) {
        CollectionCus list = new LinkedListCus();
        for (int i = 0; i < 15; i++) {
            list.add(new String("string" + i));
        }
        System.out.println(list.size());

        // 用这种方法遍历，无法实现通用，所以让每一个容器实现自己的遍历方式。
        // ArrayListCus array = (ArrayListCus) list;
        // for (int i = 0; i < array.size(); i++) {
        // }

        //以下代码对于任何容器，都通用。(可以使用泛型)
        IteratorCus iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }
    }
}