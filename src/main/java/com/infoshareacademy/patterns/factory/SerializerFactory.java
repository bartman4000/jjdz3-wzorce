package com.infoshareacademy.patterns.factory;

/**
 * Created by bartman3000 on 24.06.17.
 */
public class SerializerFactory {

    public Serializer create(String type)
    {
        switch(type)
        {
            case "json":
                return new JSONSerializer();

            case "xml":
                return new XMLSerializer();

            default:
                throw new RuntimeException("Wrong type of serializer");

        }
    }

}
