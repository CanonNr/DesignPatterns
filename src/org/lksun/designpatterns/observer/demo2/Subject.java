package org.lksun.designpatterns.observer.demo2;

import java.util.Observable;

public class Subject extends Observable {
    private int data;
    public void make(int data) {
        setChanged();
        this.data = data;
        notifyObservers();
    }
}
