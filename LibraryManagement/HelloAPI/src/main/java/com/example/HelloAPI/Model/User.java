package com.example.HelloAPI.Model;

public class User {
    private String name;
    private Integer age;
    private String favrt;

    public User(String name, Integer age, String favrt) {
        this.name = name;
        this.age = age;
        this.favrt = favrt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getFavrt() {
        return favrt;
    }

    public void setFavrt(String favrt) {
        this.favrt = favrt;
    }
}
