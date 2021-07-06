/*
 * @Author: KingWJC
 * @Date: 2021-07-06 13:24:41
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-07-06 14:14:21
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\memento\V3\CareTaker.java
 */
package memento.V4;

import java.util.HashMap;

public class CareTaker {
    private HashMap<String, IMemento> recordList = new HashMap<>();

    public void setMemento(String name, IMemento memento) {
        if (!recordList.containsKey(name)) {
            recordList.put(name, memento);
        }
    }

    public IMemento getMemento(String name) {
        return recordList.get(name);
    }
}