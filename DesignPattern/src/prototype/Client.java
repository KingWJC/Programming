/*
 * @Author: KingWJC
 * @Date: 2021-05-25 15:10:29
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-05-25 17:28:12
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\prototype\Client.java
 */
package prototype;

import java.util.List;

public class Client {
    public static void main(String[] args) throws Exception {
        Person person = new Person("wjc", 31, new Location(new String("安贞门"), 16));
        person.friend = new Friend();
        Person newPerson = (Person) person.clone();
        // 验证引用是否一致
        System.out.println(person.loc.street == newPerson.loc.street);
        // 验证对原型进行修改，是否对新的对象有影响
        person.loc.street = "呼家楼";
        System.out.println(newPerson.loc.street);

        // 验证引用是否一致
        System.out.println(person.friend == newPerson.friend);
        // 验证对原型进行修改，是否对新的对象有影响
        System.out.println(person.friend);
        System.out.println(newPerson.friend);
        person.friend.members = List.of("zs", "ls");
        System.out.println(person.friend);
        System.out.println(newPerson.friend);
    }

}