package com.infoshareacademy.patterns.observer;

public class WallSwitch extends AbstractSwitch {

    public void push() {
        notifyObservers();
    }
}
