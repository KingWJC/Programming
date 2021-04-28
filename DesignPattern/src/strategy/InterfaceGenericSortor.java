package strategy;
/*
 * @Author: KingWJC
 * @Date: 2021-04-28 14:46:45
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-04-28 16:57:52
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\strategy\InterfaceGenericSortor.java
 * 
 * 警告：
 * GenericComparable is a raw type. References to generic type GenericComparable<T> should be parameterized
 * 
 * Java不能实现真正的泛型，只能使用类型擦除来实现伪泛型。
 * 因为类型擦除的问题，所以所有的泛型类型变量最后都会被替换为原始类型Object。
 * 如：ArrayList的get方法会根据引用类型进行强制转换。
 * 
 * 检查编译的对象和引用传递的问题：泛型的类型检查是针对引用的,而无关它真正引用的对象
 * 如：new ArrayList()只是在内存中开辟一个存储空间，可以存储任何的类型对象，而真正涉及类型检查的是它的引用
 * 
 * 泛型使用问题：
 * https://www.cnblogs.com/baiqiantao/p/7475477.html
 */

import java.util.Arrays;

public class InterfaceGenericSortor {
    public static void main(String[] args) {
        Person[] array = { new Person("wy", 52), new Person("wjc", 12), new Person("www", 32) };
        Sortor03 sorter = new Sortor03();
        sorter.sort(array);
        System.out.println(Arrays.toString(array));
    }
}

interface GenericComparable<T> {
    int compareTo(T obj);
}

class Person implements GenericComparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person user) {
        if (user.age > age) {
            return -1;
        }
        if (user.age < age) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "姓名：" + name + ",年龄：" + age;
    }
}

class Sortor03 {
    public void sort(GenericComparable[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    GenericComparable<?> obj = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = obj;
                }
            }
        }
    }
}