package org.lksun.designpatterns.observer.demo1;

public abstract class LObserver {
    protected Subject subject;
    public abstract void update();
}
