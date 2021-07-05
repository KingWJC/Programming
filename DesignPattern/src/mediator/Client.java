/*
 * @Author: KingWJC
 * @Date: 2021-07-05 15:12:43
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-07-05 16:01:14
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\mediator\Client.java
 */
package mediator;

public class Client {
    public static void main(String[] args) {
        AbstractMediator mediator = new Mediator();

        Purchase purchase = new Purchase(mediator);
        mediator.setPurchase(purchase);

        Sale sale = new Sale(mediator);
        mediator.setSale(sale);

        Stock stock = new Stock(mediator);
        mediator.setStock(stock);

        purchase.buy(100);
        sale.sell(20);
        stock.clearStock();
    }
}