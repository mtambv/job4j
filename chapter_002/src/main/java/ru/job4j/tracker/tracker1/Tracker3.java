package ru.job4j.tracker.tracker1;

import ru.job4j.tracker.Item;

public class Tracker3 {
    private static final Tracker3 INSTANCE = new Tracker3();

    private Tracker3() {
    }

    public static Tracker3 getInstance() {
        return INSTANCE;
    }

    public static Tracker3 getTracker3() {
        return new Tracker3();
    }

    public Item add(Item model) {
        return model;
    }

    public static void main(String[] args) {
        Tracker3 tracker = Tracker3.getInstance();
    }
}