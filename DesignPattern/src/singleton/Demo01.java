/*
 * @Author: KingWJC
 * @Date: 2021-04-27 11:07:38
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-04-27 17:11:33
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\singleton\demo01.java
 * 
 *  饿汉模式： 使用静态，类加载到内存时，就完成实例化. JVM线程安全(因为类的加载机制)

 *  缺点：不管用不用，都会加载一次对象。
 * 
 *  classloder机制：Java的ClassLoader机制（源码级别）和Java类的加载、链接和初始化
 *      类加载机制：在JVM的生命周期里，每个类只会被加载一次。
 *      类加载时机：1）第一次创建对象要加载类.
 *                 2）调用静态方法时要加载类,访问静态属性时会加载类。
 *                 3）加载子类时必定会先加载父类。
 *                 4）创建对象引用不加载类.
 *                 5) 子类调用父类的静态方法时
 *                  (1)当子类没有覆盖父类的静态方法时，只加载父类，不加载子类
 *                  (2)当子类有覆盖父类的静态方法时，既加载父类，又加载子类
 *                 6）访问静态常量，如果编译器可以计算出常量的值，则不会加载类,例如:public static final int a =123;
 *                  否则会加载类,例如:public static final int a = math.PI。
 *      内部类：内部类是延时加载的，也就是说只会在第一次使用时加载。不使用就不加载。
 *             静态内部类的加载不需要依附外部类，在使用时才加载。不过在加载静态内部类的过程中也会加载外部类
 * 
 *  Static用法：
 *      1)修饰成员变量和方法，存储在JVM的静态存储区区
 *      2）静态代码块。
 *          优化性能，在类初次被加载的时候执行且仅会被执行一次。
 *          static块可以置于类中的任何地方，类中可以有多个static块
 *          会按照static块的顺序来执行每个static块，一般用来初始化静态变量和调用静态方法。
 *      3）static静态导包-不常用。
 */

package singleton;

public class Demo01 {
    //静态常量声明方式一：
    // private final static Demo01 INSTANCE = new Demo01();

    //静态常量声明方式二： 
    private final static Demo01 INSTANCE;
    static {
        INSTANCE = new Demo01();
    }

    private Demo01() {
    }

    public static Demo01 getInstance() {
        return INSTANCE;
    }

    public void test() {
        System.out.println("singleton");
    }

    public static void main(String[] args) {
        Demo01 demo = Demo01.getInstance();
        demo.test();
    }
}