package singleton;

import java.util.ArrayList;

/*
 * @Author: KingWJC
 * @Date: 2021-04-27 15:28:58
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-05-20 11:52:49
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\singleton\Demo06.java
 * 
 *  使用枚举，可以解决线程同步，还可以防止反序列化
 *  
 * 枚举特性：
 *  1.enum继承的是java.lang.Enum类，Enum类继承自Object类。所以不能再继承其它类，其它用法和普通类相同。
 *  2.同一时候注意枚举类不能派生子类（类的默认修饰符为final)。它仅有private构造器
 *  3.枚举类的全部实例必须在其首行显式列出，否则它不能产生实例
 *  4.枚举中的实例和静态代码块一样，加载枚举类的时候进行实例化。
 * 
 */
public enum Demo06 {
    INSTANCE("01"),INSTANCE2("02");

    private String name;

    Demo06(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Demo06.INSTANCE.hashCode());
            }).start();
        }
    }
}
