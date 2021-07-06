/*
 * @Author: KingWJC
 * @Date: 2021-07-06 13:24:41
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-07-06 13:31:36
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\memento\V1\CareTaker.java
 */
package memento.V1;

public class CareTaker {
    private Memento memento;

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }
}