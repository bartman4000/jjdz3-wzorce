package com.infoshareacademy.patterns.observer;

public class DoorBell implements Observer {

    @Override
    public void update() {
        System.out.println("Doorbell rings!");
    }
}
