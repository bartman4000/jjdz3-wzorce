package com.infoshareacademy.patterns.builder;

import java.util.Map;

/**
 * Created by bartman3000 on 24.06.17.
 */
public class PrettyXMLBuilder implements SimpleXMLBuilder {

    private int indentationLevel;
    private StringBuilder stringBuilder;

    public PrettyXMLBuilder()
    {
        this.stringBuilder = new StringBuilder();
    }

    public PrettyXMLBuilder(int indentationLevel)
    {
        this.stringBuilder = new StringBuilder();
        this.indentationLevel = indentationLevel;
    }


    @Override
    public void startTag(String name) {

        for (int i = 0; i < indentationLevel; i++) {
            stringBuilder.append("  ");
        }
        stringBuilder.append("<" + name + ">\n");
        indentationLevel++;
    }

    @Override
    public void addContent(String content) {

        for (int i = 0; i < indentationLevel; i++) {
            stringBuilder.append("  ");
        }
        stringBuilder.append(content + "\n");

    }

    @Override
    public void endTag(String name) {

        indentationLevel--;
        for (int i = 0; i < indentationLevel; i++) {
            stringBuilder.append("  ");
        }

        stringBuilder.append("</" + name + ">\n");

    }

    @Override
    public String buildXml() {
        return stringBuilder.toString();
    }
}
