/*
 * @Author: KingWJC
 * @Date: 2021-07-06 13:23:53
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-07-06 13:48:58
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\memento\V3\Memento.java
 */
package memento.V3;

import java.util.HashMap;

public class Memento {
    private HashMap<String, Object> lMap;

    public Memento(HashMap<String, Object> state) {
        this.lMap = state;
    }

    public HashMap<String, Object> getState() {
        return lMap;
    }
}