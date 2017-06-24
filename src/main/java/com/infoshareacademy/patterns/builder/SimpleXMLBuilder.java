package com.infoshareacademy.patterns.builder;

import java.util.Map;

/**
 * Created by bartman3000 on 24.06.17.
 */
public interface SimpleXMLBuilder {

    public void startTag(String name, Map attr);
    public void startTag(String name);
    public void addContent(String content);
    void endTag(String name);
    String buildXml();
}
