/*
 * @Author: KingWJC
 * @Date: 2021-05-25 15:05:27
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-05-25 17:02:52
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\prototype\Person.java
 */
package prototype;

public class Person implements Cloneable {
    String name;
    int age;
    Location loc;
    Friend friend;

    public Person(String name, int age, Location loc) {
        this.name = name;
        this.age = age;
        this.loc = loc;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 浅复制
        // return super.clone();
        // 深复制
        Person propotype = (Person) super.clone();
        propotype.loc = (Location) loc.clone();
        propotype.friend = friend.cloFriend();
        return propotype;
    }
}
