package com.infoshareacademy.patterns.adapter;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        XmlParser11Adapter adapter = new XmlParser11Adapter();
        Stream<String> xmlStream = Stream.of("<start>", "content", "</start>");

        Xml xml = adapter.parse(xmlStream);
        System.out.println(xml);

    }
}
