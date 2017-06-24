package com.infoshareacademy.patterns.factory;

/**
 * Created by bartman3000 on 24.06.17.
 */
public class JSONSerializer implements Serializer {

    public String filename;

    public JSONSerializer(String file) {
        this.filename = file;
    }

    @Override
    public void serialize(Object o, String filename) {

    }

    @Override
    public Configuration deserialize() {
        System.out.println("Deserializing Json file:" + filename);

        Configuration configuration = new Configuration();
        configuration.setPort(8080);

        configuration.setRemoteServiceUrl("http://service.com");
        configuration.setRemoteServicePort(1234);

        return configuration;
    }
}
