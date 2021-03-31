package org.lksun.designpatterns.observer.demo2;

import java.util.Observable;
import java.util.Observer;

public class BObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("B");
    }
}
