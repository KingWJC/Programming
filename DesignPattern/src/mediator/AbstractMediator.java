/*
 * @Author: KingWJC
 * @Date: 2021-07-05 15:16:30
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-07-05 15:16:31
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\mediator\AbstractMediator.java
 */
package mediator;

public abstract class AbstractMediator {
    protected Purchase purchase;
    protected Sale sale;
    protected Stock stock;

    public AbstractMediator() {

    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public abstract void buy(int number);

    public abstract void sell(int number);

    public abstract void offSell();

    public abstract void clearStock();
}