package com.infoshareacademy.patterns.observer;

public class LightBulb implements Observer {

    @Override
    public void update() {
        System.out.println("Light bulb switched on!");
    }
}
