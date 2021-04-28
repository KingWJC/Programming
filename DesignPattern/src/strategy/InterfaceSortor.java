package strategy;
/*
 * @Author: KingWJC
 * @Date: 2021-04-28 14:46:45
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-04-28 16:08:01
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\strategy\InterfaceSortor.java
 */

import java.util.Arrays;

public class InterfaceSortor {
    public static void main(String[] args) {
        Comparable[] array = new Comparable[] { new User("wy", 52), new User("wjc", 12), new User("www", 32) };
        Sortor02 sorter = new Sortor02();
        sorter.sort(array);
        System.out.println(Arrays.toString(array));
    }
}

interface Comparable {
    int compareTo(Object obj);
}

class User implements Comparable {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Object obj) {
        User user = (User) obj;
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

class Sortor02 {
    public void sort(Comparable[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                // 是array[j]与array[j+1]比较，而不是array[i]与array[j]比较。两两比较。
                if (array[j].compareTo(array[j + 1]) > 0) {
                    Comparable obj = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = obj;
                }
            }
        }
    }
}