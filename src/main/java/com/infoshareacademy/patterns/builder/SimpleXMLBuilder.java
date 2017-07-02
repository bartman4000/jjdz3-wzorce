package com.infoshareacademy.patterns.builder;

/**
 * Created by bartman3000 on 24.06.17.
 */
public interface SimpleXMLBuilder {

    public void startTag(String name);
    public void addContent(String content);
    void endTag(String name);
    String buildXml();
}
