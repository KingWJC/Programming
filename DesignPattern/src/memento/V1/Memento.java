/*
 * @Author: KingWJC
 * @Date: 2021-07-06 13:23:53
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-07-06 13:30:12
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\memento\V1\Memento.java
 */
package memento.V1;

public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}