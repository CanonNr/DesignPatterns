package org.lksun.designpatterns.observer.demo1;

public class CObserver extends LObserver {
    CObserver(Subject subject){
        this.subject = subject;
        subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("C:"+subject.data);
    }
}
