package ru.job4j.tracker.tracker1;

import ru.job4j.tracker.Item;

public class Tracker4 {
    private Tracker4() {
    }

    public static Tracker4 getInstance() {
        return Holder.INSTANCE;
    }

    public static Tracker4 getTracker4() {
        return new Tracker4();
    }

    public Item add(Item model) {
        return model;
    }

    private static final class Holder {
        private static final Tracker4 INSTANCE = new Tracker4();
    }

    public static void main(String[] args) {
        Tracker4 tracker = Tracker4.getInstance();
    }
}