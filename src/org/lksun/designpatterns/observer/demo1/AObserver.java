package org.lksun.designpatterns.observer.demo1;

public class AObserver extends LObserver {
    AObserver(Subject subject){
        this.subject = subject;
        subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("A:"+subject.data);
    }
}
