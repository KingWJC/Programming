/*
 * @Author: KingWJC
 * @Date: 2021-07-06 13:24:41
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-07-06 14:14:21
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\memento\V3\CareTaker.java
 */
package memento.V3;

import java.util.HashMap;

public class CareTaker {
    private HashMap<String, Memento> recordList = new HashMap<>();

    public void setMemento(String name, Memento memento) {
        if (!recordList.containsKey(name)) {
            recordList.put(name, memento);
        }
    }

    public Memento getMemento(String name) {
        return recordList.get(name);
    }
}