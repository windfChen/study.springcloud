package com.windf.study.springcloud.growing.domain;

public class Log {
    private Long id;
    private String name;

    public Log() {
    }

    public Log(Long id) {
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
