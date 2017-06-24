package com.infoshareacademy.patterns.factory;

/**
 * Created by bartman3000 on 24.06.17.
 */
public class XMLSerializer implements Serializer {
    @Override
    public void serialize(Object o, String filename) {

    }

    @Override
    public Configuration deserialize(String filename) {
        System.out.println("Deserializing Xml file");

        Configuration configuration = new Configuration();
        configuration.setPort(8080);

        configuration.setRemoteServiceUrl("http://service.com");
        configuration.setRemoteServicePort(1234);

        return configuration;
    }
}
