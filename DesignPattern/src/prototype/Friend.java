/*
 * @Author: KingWJC
 * @Date: 2021-05-25 16:21:32
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-05-25 17:27:52
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\prototype\Friend.java
 */
package prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;

public class Friend implements Serializable {
    private static final long serialVersionUID = 1;

    int count;
    List<String> members;

    public Friend() {
        count = 3;
        members = List.of("wy", "wjc", "ww");
    }

    public Friend cloFriend() {
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(bos);) {
            oos.writeObject(this); // 序列化对象
            try (ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
                    ObjectInputStream ois = new ObjectInputStream(bis);) {
                return (Friend) ois.readObject();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public String toString() {
        return members.toString();
    }
}