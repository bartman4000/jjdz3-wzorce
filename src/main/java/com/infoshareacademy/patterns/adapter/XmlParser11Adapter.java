package com.infoshareacademy.patterns.adapter;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class XmlParser11Adapter implements XmlParser2 {

    private XmlParser11 parser;

    XmlParser11Adapter ()
    {
        parser = new XmlParser11();
    }


    @Override
    public Xml parse(Stream<String> xml) {

        String xmlString = xml.collect(Collectors.joining());
        return parser.parse(xmlString);
    }
}
