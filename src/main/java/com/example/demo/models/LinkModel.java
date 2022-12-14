package com.example.demo.models;

import lombok.Data;

@Data
public class LinkModel {
    private final Integer authorId;
    private String linkName;
    private String linkURL;
    private String description;

    public LinkModel() {
        this("name");
    }

    public LinkModel(String linkName) {
        this(linkName, "url");
    }

    public LinkModel(String linkName, String linkURL) {
        this(linkName, linkURL, "no description");
    }

    public LinkModel(String linkName, String linkURL, String description) {
        this(1, linkName, linkURL, description);
    }

    public LinkModel(Integer authorId, String linkName, String linkURL, String description) {
        this.authorId = authorId;
        this.linkURL = linkURL;
        this.linkName = linkName;
        this.description = description;
    }
}
