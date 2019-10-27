package ru.job4j.search;

public class User {
    private int id;
    private String name;
    private String city;
    private int age;

    public User(int id, String name, String city, int age) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.age = age;
     }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name; }

    public String getCity() {

        return this.city;
    }
    public Integer getAge() {
        return this.age;
    }
}