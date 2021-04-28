package strategy;
/*
 * @Author: KingWJC
 * @Date: 2021-04-28 14:47:09
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-04-28 17:40:02
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\strategy\StraterySorter.java
 */

import java.util.Arrays;

public class StraterySorter {
    public static void main(String[] args) {
        People[] array = { new People("wy", 52), new People("wjc", 12), new People("wwww", 32) };
        Sort04<People> sorter = new Sort04<>();
        sorter.sort(array, new PeopleComparator());
        System.out.println(Arrays.toString(array));
        sorter.sort(array, (a, b) -> {
            if (a.getName().length() < b.getName().length())
                return -1;
            else if (a.getName().length() > b.getName().length())
                return 1;
            else
                return 0;
        });
        System.out.println(Arrays.toString(array));
    }
}

class People {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "姓名：" + name + ",年龄：" + age;
    }
}

interface Comparator<T> {
    int compara(T a, T b);
}

class PeopleComparator implements Comparator<People> {

    @Override
    public int compara(People a, People b) {
        if (a.getAge() > b.getAge())
            return 1;
        if (a.getAge() < b.getAge())
            return -1;
        return 0;
    }

}

class Sort04<T> {
    public void sort(T[] array, Comparator<T> comparator) {
        for (int i = 0; i < array.length - 1; i++) {
            T current = array[i + 1];
            int preIndex = i;
            while (preIndex >= 0 && comparator.compara(array[preIndex], current) > 0) {
                array[preIndex + 1] = array[preIndex];
                preIndex--;
            }
            array[preIndex + 1] = current;
        }
    }
}
