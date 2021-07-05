/*
 * @Author: KingWJC
 * @Date: 2021-07-05 15:19:55
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-07-05 15:46:16
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\mediator\Purchase.java
 */
package mediator;

public class Purchase extends AbstractColleague {
    public Purchase(AbstractMediator mediator) {
        super(mediator);
    }

    public void buy(int number)
    {
        this.mediator.buy(number);
    }

    public void refuseBuy()
    {
        System.out.println("拒绝购买！");
    }
}