package com.infoshareacademy.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class AbstractSwitch implements Observable {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

}
