/*
 * @Author: KingWJC
 * @Date: 2021-07-05 15:18:54
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-07-05 16:04:11
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\mediator\Sale.java
 */
package mediator;

import java.util.Random;

public class Sale extends AbstractColleague {
    public Sale(AbstractMediator mediator) {
        super(mediator);
    }

    public void sell(int number) {
        System.out.println("卖出:" + number + "台");
        this.mediator.sell(number);
    }

    public void offSell() {
        this.mediator.offSell();
    }

    public int getSaleStatus() {
        Random random = new Random(System.currentTimeMillis());
        int saleStatus = random.nextInt(100);
        System.out.println("销售情况为:" + saleStatus + "台");
        return saleStatus;
    }
}