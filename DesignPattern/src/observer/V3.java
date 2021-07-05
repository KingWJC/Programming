package observer;

import java.util.ArrayList;

/**
 * 有很多时候，观察者需要根据事件的具体情况来进行处理. 事件一般包括时间,地点,观察源等. 大多数时候，我们处理事件的时候，需要事件源对象
 * 事件也可以形成继承体系
 */
public class V3 {
    public static void main(String[] args) {
        Child3 child = new Child3();
        child.wakeUp();
    }
}

class Child3 {
    private boolean isCry = false;
    private ArrayList<Observer3> list = new ArrayList<>();

    public Child3() {
        list.add(new Dad3());
        list.add(new Mum3());
    }

    public boolean isCry() {
        return isCry;
    }

    public void wakeUp() {
        System.out.println("baby crying...");
        isCry = true;
        WakeupEvent event = new WakeupEvent("bed", System.currentTimeMillis(), this);
        for (Observer3 observer : list) {
            observer.actionOnCry(event);
        }
    }
}

abstract class Event<T> {
    long timestamp;
    String loc;
    T source;

    protected Event(String place, long timestamp, T source) {
        this.loc = place;
        this.timestamp = timestamp;
        this.source = source;
    }

    abstract T getSource();
}

class WakeupEvent extends Event<Child3> {
    public WakeupEvent(String place, long timestamp, Child3 source) {
        super(place, timestamp, source);
    }

    @Override
    Child3 getSource() {
        return source;
    }
}

interface Observer3 {
    void actionOnCry(WakeupEvent event);
}

class Dad3 implements Observer3 {

    public void feed() {
        System.out.println("dad feeding ...");
    }

    public void actionOnCry(WakeupEvent event) {
        feed();
    }
}

class Mum3 implements Observer3 {
    public void hug() {
        System.out.println("mum hugging ...");
    }

    public void actionOnCry(WakeupEvent event) {
        hug();
    }
}