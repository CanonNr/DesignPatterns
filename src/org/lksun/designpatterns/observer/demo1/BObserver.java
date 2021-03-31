package org.lksun.designpatterns.observer.demo1;

public class BObserver extends LObserver {
    BObserver(Subject subject){
        this.subject = subject;
        subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("B:"+subject.data);
    }
}
