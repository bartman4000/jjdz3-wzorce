package com.infoshareacademy.patterns.factory;

/**
 * Created by bartman3000 on 24.06.17.
 */
public interface Serializer {

    public String filename = null;

    public void serialize(Object o, String filename);
    public Configuration deserialize();

}
