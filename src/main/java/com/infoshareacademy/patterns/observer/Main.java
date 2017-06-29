package com.infoshareacademy.patterns.observer;


public class Main {

    public static void main(String[] args) {
        Observer lightBulb = new LightBulb();
        Observer doorBell = new DoorBell();

        ToggleSwitch toogleSwitch = new ToggleSwitch();
        toogleSwitch.addObserver(lightBulb);
        toogleSwitch.addObserver(doorBell);

        WallSwitch wallSwitch = new WallSwitch();
        wallSwitch.addObserver(lightBulb);
        wallSwitch.addObserver(doorBell);

        toogleSwitch.push();
        wallSwitch.push();
    }
}
