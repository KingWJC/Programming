/*
 * @Author: KingWJC
 * @Date: 2021-07-06 13:23:29
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-07-06 13:43:13
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\memento\V2\Originator.java
 */
package memento.V2;

public class Originator implements Cloneable{
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    protected Originator clone() {
        try {
            return (Originator)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void restore(Originator memento) {
        this.setState(memento.getState());
    }

}