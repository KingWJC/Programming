package strategy;
/*
 * @Author: KingWJC
 * @Date: 2021-04-28 14:44:30
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-04-28 15:43:55
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\strategy\NormalSortor.java
 */

import java.util.Arrays;

public class NormalSortor {
    public static void main(String[] args) {
        int[] array = new int[] { 1, 5, 3, 2, 6, 3, 0, 8 };
        Sortor01 sorter = new Sortor01();
        sorter.Sort(array);
        System.out.println(Arrays.toString(array));
    }
}

class Sortor01 {
    public void Sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minPos = i;
            for (int j = i + 1; j < array.length; j++) {
                //使用array[minPos]而不是array[i],用改变后的索引参与下一次比较。
                if (array[minPos] > array[j]) {
                    minPos = j;
                }
            }
            if (minPos > i)
                swap(array, i, minPos);
        }
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}