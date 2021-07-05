package observer;

/**
 * 过程式和对象式 通过循环一直监听isCry状态.
 */
public class V1 {
    public static void main(String[] args) {
        boolean isCry = false;
        while (isCry) {
            System.out.println("obserber.....");
        }

        Child1 child = new Child1();
        child.wakeUp();
        while (child.isCry()) {
            System.out.println("obserber.....");
            Dad1 dad = new Dad1();
            dad.feed();
        }
    }
}

class Child1 {
    private boolean isCry = false;

    public boolean isCry() {
        return isCry;
    }

    public void wakeUp() {
        System.out.println("baby crying!");
        isCry = true;
        // System.getLogger(V1.class.getName()).log(Level.INFO, "baby crying!");
    }
}

class Dad1 {
    public void feed() {
        System.out.println("dad feeding...");
    }
}