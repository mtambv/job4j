package ru.job4j.tracker;

public class FindAllItem implements UserAction {

    public int key() {
        return 1;
    }
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Displaying all items in the Tracker -----------");
        Item[] items = tracker.findAll();
        for (Item item : items) {
            System.out.println(item);
        }
    }
    public String info() {
        return "Show all items";
    }
}
