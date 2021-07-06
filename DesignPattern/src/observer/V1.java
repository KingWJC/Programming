/*
 * @Author: KingWJC
 * @Date: 2021-07-06 09:34:40
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-07-06 11:22:37
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\observer\V1.java
 */
package observer;

/**
 * 过程式和对象式 通过循环一直监听isCry状态.
 */
public class V1 {
    public static void main(String[] args) {
        boolean isCry = false;
        while (isCry) {
            System.out.println("obserber.....");
        }

        Child1 child = new Child1();
        Dad1 dad = new Dad1();
        AI ai = new AI(child, dad);
        ai.start();

        child.wakeUp();
    }
}

class AI extends Thread {
    private Child1 child;
    private Dad1 dad;

    public AI(Child1 child, Dad1 dad) {
        this.child = child;
        this.dad = dad;
    }

    @Override
    public void run() {
        while (true) {
            if (child.isCry()) {
                dad.feed();
                // 重置状态
                child.setCry(false);
            }
        }
    }
}

class Child1 {
    private boolean isCry = false;

    public boolean isCry() {
        return isCry;
    }

    public void setCry(boolean isCry) {
        this.isCry = isCry;
    }

    public void wakeUp() {
        System.out.println("baby crying!");
        isCry = true;
        // System.getLogger(V1.class.getName()).log(Level.INFO, "baby crying!");
    }
}

class Dad1 {
    public void feed() {
        System.out.println("dad feeding...");
    }
}