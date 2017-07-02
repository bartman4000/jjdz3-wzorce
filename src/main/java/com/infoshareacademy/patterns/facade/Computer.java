package com.infoshareacademy.patterns.facade;

/**
 * Created by bartman3000 on 02.07.17.
 */
public class Computer {

    private BuildingsInitializer buildingsInitializer = new BuildingsInitializer();
    private PlayersInitializer playersInitializer = new PlayersInitializer();
    private TransportInitializer transportInitializer = new TransportInitializer();

    void startcomputer()
    {
        buildingsInitializer.initializeCommercialBuldings();
        buildingsInitializer.initializeHousingBuldings();
        buildingsInitializer.initializeIndustrialBuldings();

        playersInitializer.initializeComputerPlayer();

        transportInitializer.initializeRoads();
        transportInitializer.initializeCars();
        transportInitializer.initializeRailways();
        transportInitializer.initializeTrains();
    }

}
