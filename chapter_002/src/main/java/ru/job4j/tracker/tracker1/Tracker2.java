package ru.job4j.tracker.tracker1;


import ru.job4j.tracker.Item;

public class Tracker2 {
    private static Tracker2 instance;

    private Tracker2() {
    }
    private Item[] items = new Item[100];
    public static Tracker2 getInstance() {
        if (instance == null) {
            instance = new Tracker2();
        }
        return instance;
    }

    public static Tracker2 getTracker2() {
       return new Tracker2();
    }

    public Item add(Item model) {
        return model;
    }
}