package com.infoshareacademy.patterns.factory;

/**
 * Created by bartman3000 on 24.06.17.
 */
public class XMLSerializer implements Serializer {

    public String filename;

    public XMLSerializer(String filename) {

        this.filename = filename;
    }

    @Override
    public void serialize(Object o, String filename) {

    }

    @Override
    public Configuration deserialize() {
        System.out.println("Deserializing Xml file:"+ filename);

        Configuration configuration = new Configuration();
        configuration.setPort(8080);

        configuration.setRemoteServiceUrl("http://service.com");
        configuration.setRemoteServicePort(1234);

        return configuration;
    }
}
