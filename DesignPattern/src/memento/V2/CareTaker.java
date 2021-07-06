/*
 * @Author: KingWJC
 * @Date: 2021-07-06 13:24:41
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-07-06 13:31:36
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\memento\V1\CareTaker.java
 */
package memento.V2;

public class CareTaker {
    private Originator memento;

    public void setMemento(Originator memento) {
        this.memento = memento;
    }

    public Originator getMemento() {
        return memento;
    }
}