package com.infoshareacademy.patterns.builder;

/**
 * Created by bartman3000 on 24.06.17.
 */
public class MinifiedXMLBuilder implements SimpleXMLBuilder {

    private StringBuilder stringBuilder;

    public MinifiedXMLBuilder()
    {
        this.stringBuilder = new StringBuilder();
    }

    @Override
    public void startTag(String name) {

        stringBuilder.append("<" + name + ">");

    }

    @Override
    public void addContent(String content) {

        stringBuilder.append(content);

    }

    @Override
    public void endTag(String name) {

        stringBuilder.append("</" + name + ">");

    }

    @Override
    public String buildXml() {
        return stringBuilder.toString();
    }
}
