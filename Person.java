package com.klu.MyMavenProject;

public abstract class Person {

    private int id;
    private String name;
    private String phone;

    public Person(int id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public abstract String getRole();

    @Override
    public String toString() {
        return "ID: " + id +
               ", Name: " + name +
               ", Phone: " + phone;
    }
}
