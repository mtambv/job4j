package ru.job4j.tracker.tracker1;

import ru.job4j.tracker.Item;

public enum Tracker1 {

    INSTANCE; // здесь мы указываем перечисления.

    // Конструкторы и методы.
    //private Item[] items = new Item[100];

    public Item add(Item model) {
        return model;
    }
    private final static class Temp {
         Tracker1 tracker  = Tracker1.INSTANCE;
    }
}