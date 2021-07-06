/*
 * @Author: KingWJC
 * @Date: 2021-07-06 09:34:40
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-07-06 13:08:11
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\observer\V2.java
 */
package observer;

import java.util.ArrayList;

/**
 * 使用聚集方式，加入多个观察者, 
 * 1.和被观察者藕合,直接调用观察者的方法.
 * 2.抽象观察者,分离观察者与具体被观察者
 * 
 */
public class V2 {
    public static void main(String[] args) {
        Child2 child = new Child2();
        child.wakeUp();
    }
}

class Child2 {
    private boolean isCry = false;
    private ArrayList<Observer> list = new ArrayList<>();

    public Child2() {
        list.add(new Dad2());
        list.add(new Mum2());
    }

    public boolean isCry() {
        return isCry;
    }

    public void wakeUp() {
        System.out.println("baby crying...");
        isCry = true;
        for (Observer observer : list) {
            observer.actionOnCry();
        }
    }
}

interface Observer {
    void actionOnCry();
}

class Dad2 implements Observer {

    public void feed() {
        System.out.println("dad feeding ...");
    }

    public void actionOnCry() {
        feed();
    }
}

class Mum2 implements Observer {
    public void hug() {
        System.out.println("mum hugging ...");
    }

    public void actionOnCry() {
        hug();
    }
}