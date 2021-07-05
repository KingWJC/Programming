/*
 * @Author: KingWJC
 * @Date: 2021-07-05 15:18:40
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-07-05 15:36:35
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\mediator\Stock.java
 */
package mediator;

public class Stock extends AbstractColleague {
    private int computerNum = 100;

    public Stock(AbstractMediator mediator) {
        super(mediator);
    }

    public void increase(int number) {
        computerNum += number;
        System.out.println("库存数量为:" + computerNum);
    }

    public void minus(int number) {
        computerNum -= number;
        System.out.println("库存数量为:" + computerNum);
    }

    public int getComputerNum() {
        return computerNum;
    }

    public void clearStock() {
        System.out.println("清理的库存数量为:" + computerNum);
        this.mediator.clearStock();
    }
}