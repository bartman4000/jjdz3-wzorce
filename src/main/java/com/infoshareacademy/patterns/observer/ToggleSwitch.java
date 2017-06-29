package com.infoshareacademy.patterns.observer;

public class ToggleSwitch extends AbstractSwitch {

    public void push() {
        notifyObservers();
    }
}
