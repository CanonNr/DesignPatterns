package org.lksun.designpatterns.observer.demo1;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    List<LObserver> observers = new ArrayList<LObserver>();

    public int data = 10;

    public void attach(LObserver observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (LObserver observer : observers) {
            observer.update();
        }
    }

    public void setData(int data) {
        this.data = data;
        notifyAllObservers();
    }
}
