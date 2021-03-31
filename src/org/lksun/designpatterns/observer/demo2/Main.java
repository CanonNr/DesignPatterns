package org.lksun.designpatterns.observer.demo2;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.addObserver(new AObserver());
        subject.addObserver(new BObserver());
        subject.make(5);
        subject.make(5);
    }
}
