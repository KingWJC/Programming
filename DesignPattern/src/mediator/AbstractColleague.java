/*
 * @Author: KingWJC
 * @Date: 2021-07-05 15:16:58
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-07-05 15:16:59
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\mediator\AbstractColleague.java
 */
package mediator;

public class AbstractColleague {
    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator mediator) {
        this.mediator = mediator;
    }
}