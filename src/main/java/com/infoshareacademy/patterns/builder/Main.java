package com.infoshareacademy.patterns.builder;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

       PrettyXMLBuilder xmlGenerator = new PrettyXMLBuilder();
        Map attrs =new HashMap();
        attrs.put("id", 1000);

        xmlGenerator.startTag("start", attrs);
        xmlGenerator.addContent("content");
        xmlGenerator.startTag("foo");
        xmlGenerator.addContent("foo_content");
        xmlGenerator.endTag("foo");
        xmlGenerator.endTag("start");
        String xml = xmlGenerator.buildXml();
        System.out.println(xml);

    }
}
