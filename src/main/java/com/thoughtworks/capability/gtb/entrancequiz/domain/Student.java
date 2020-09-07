package com.thoughtworks.capability.gtb.entrancequiz.domain;


public class Student {
    private String id;
    private String name;
    private String group;

    public Student(String id, String name, String group) {
        this.id = id;
        this.name = name;
        this.group = group;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
