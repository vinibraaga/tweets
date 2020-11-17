package com.zuldigital.vinicio20001115.model;

import org.apache.tomcat.util.http.parser.Authorization;

public class Tweet {
    private long id;
    private String text;
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
