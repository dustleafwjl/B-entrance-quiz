package com.thoughtworks.capability.gtb.entrancequiz.domain;


public class Student {
    private String id;
    private String name;
    private String group;

    public Student(String name, String group) {
        this.name = name;
        this.group = group;
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
