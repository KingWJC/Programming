/*
 * @Author: KingWJC
 * @Date: 2021-07-06 13:23:29
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-07-06 13:30:43
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\memento\V1\Originator.java
 */
package memento.V1;

public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento create() {
        return new Memento(state);
    }

    public void restore(Memento memento) {
        this.state = memento.getState();
    }
}