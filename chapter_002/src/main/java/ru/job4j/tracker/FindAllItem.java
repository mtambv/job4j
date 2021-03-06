package ru.job4j.tracker;

import java.util.List;

public class FindAllItem extends BaseAction {

    public FindAllItem(int key, String name) {
        super(key, name);
    }

    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Displaying all items in the Tracker -----------");
        List<Item> items = tracker.findAll();
        for (Item item : items) {
            System.out.println(item);
        }
    }
}
