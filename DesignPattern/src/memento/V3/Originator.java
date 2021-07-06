/*
 * @Author: KingWJC
 * @Date: 2021-07-06 13:23:29
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-07-06 14:07:56
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\memento\V3\Originator.java
 */
package memento.V3;

public class Originator {
    private String state1;
    private String state2;
    private String state3;

    public String getState1() {
        return state1;
    }

    public void setState1(String state) {
        this.state1 = state;
    }

    public String getState2() {
        return state2;
    }

    public void setState2(String state2) {
        this.state2 = state2;
    }

    public String getState3() {
        return state3;
    }

    public void setState3(String state3) {
        this.state3 = state3;
    }

    public Memento create() {
        return new Memento(BeanUtils.bacckProps(this));
    }

    public void restore(Memento memento) {
        BeanUtils.restoreProps(this, memento.getState());
    }

    @Override
    public String toString() {
        return "State1 + State2 + State3:" + state1 + state2 + state3;
    }
}