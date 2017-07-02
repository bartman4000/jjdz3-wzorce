package com.infoshareacademy.patterns.builder;

public class Main {

    public static void main(String[] args) {

      SimpleXMLBuilder xmlGenerator = new MinifiedXMLBuilder();
        xmlGenerator.startTag("start");
        xmlGenerator.addContent("content");
        xmlGenerator.startTag("foo");
        xmlGenerator.addContent("foo_content");
        xmlGenerator.endTag("foo");
        xmlGenerator.endTag("start");
        String xml = xmlGenerator.buildXml();
        System.out.println(xml);

        xmlGenerator = new PrettyXMLBuilder();
        xmlGenerator.startTag("start");
        xmlGenerator.addContent("content");
        xmlGenerator.startTag("foo");
        xmlGenerator.addContent("foo_content");
        xmlGenerator.endTag("foo");
        xmlGenerator.endTag("start");
        String xml2 = xmlGenerator.buildXml();
        System.out.println(xml2);

    }
}
