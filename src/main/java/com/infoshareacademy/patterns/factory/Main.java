package com.infoshareacademy.patterns.factory;

public class Main {

    public static void main(String[] args) {

        ConfigurationReader configurationReader = new ConfigurationReader();

        JSONSerializer jsonSerializer = new JSONSerializer("file.json");
        XMLSerializer xmlSerializer = new XMLSerializer("file.xml");
        configurationReader.load(jsonSerializer);
        configurationReader.load(xmlSerializer);


    }
}
