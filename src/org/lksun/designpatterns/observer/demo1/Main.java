package org.lksun.designpatterns.observer.demo1;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new AObserver(subject);
        new BObserver(subject);
        new CObserver(subject);

        System.out.println(subject.data);
        subject.setData(5);
        System.out.println(subject.data);
        System.out.println("----------");
        System.out.println(subject.data);
        subject.setData(15);
        System.out.println(subject.data);
    }
}
