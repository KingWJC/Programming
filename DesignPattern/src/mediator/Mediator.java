/*
 * @Author: KingWJC
 * @Date: 2021-07-05 15:17:57
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-07-05 16:03:03
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\mediator\Mediator.java
 */
package mediator;

public class Mediator extends AbstractMediator {

    @Override
    public void buy(int number) {
        int saleStatus = sale.getSaleStatus();
        if (saleStatus < 80) {
            number = number / 2;
        }
        System.out.println("买了:" + number + "台");
        stock.increase(number);
    }

    @Override
    public void sell(int number) {
        if (number > stock.getComputerNum()) {
            purchase.buy(number);
        }
        stock.minus(number);
    }

    @Override
    public void offSell() {
        System.out.println("折价销售电脑:" + stock.getComputerNum() + "台");
    }

    @Override
    public void clearStock() {
        sale.offSell();
        purchase.refuseBuy();
    }

}