package org.lksun.designpatterns.observer.demo2;

import java.util.Observable;
import java.util.Observer;

public class AObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("A");
    }
}
