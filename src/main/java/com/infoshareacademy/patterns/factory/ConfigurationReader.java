package com.infoshareacademy.patterns.factory;

public class ConfigurationReader {

    public void load(Serializer serializer) {

        Configuration configuration;

        configuration = serializer.deserialize();

        System.out.println("Deserialized config: " + configuration);
    }
}
