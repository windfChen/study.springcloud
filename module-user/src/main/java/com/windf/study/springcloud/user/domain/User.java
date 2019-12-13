package com.windf.study.springcloud.user.domain;

public class User {
    private Long id;
    private String name;

    public User() {
    }

    public User(Long id) {
        this();
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
