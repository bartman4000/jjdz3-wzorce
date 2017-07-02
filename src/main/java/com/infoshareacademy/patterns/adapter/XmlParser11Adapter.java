package com.infoshareacademy.patterns.adapter;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class XmlParser11Adapter implements XmlParser2 {

    @Override
    public Xml parse(Stream<String> xml) {

        String xmlString = xml.collect(Collectors.joining());
        XmlParser11 parser11 = new XmlParser11();
        return parser11.parse(xmlString);
    }
}
