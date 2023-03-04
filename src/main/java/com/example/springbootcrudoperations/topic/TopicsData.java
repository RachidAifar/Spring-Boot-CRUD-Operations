package com.example.springbootcrudoperations.topic;

public class TopicsData {
    private String id;
    private String name;
    private String description;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public TopicsData(String id,String name,String description) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TopicsData() {
    }

}
