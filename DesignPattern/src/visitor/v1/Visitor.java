
/*
 * @Author: KingWJC
 * @Date: 2021-07-01 17:30:12
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-07-01 18:00:32
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\visitor\v1\Visitor.java
 */
package visitor.v1;

public interface Visitor {
    void visit(PlainFile file);

    void visit(Directory dir);
}

class PrinterVisitor implements Visitor {

    @Override
    public void visit(PlainFile file) {
        System.out.println(file.getName());
    }

    @Override
    public void visit(Directory dir) {
        System.out.println(dir.getName());
    }

}