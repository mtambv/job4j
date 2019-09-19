package ru.job4j.tracker;

public class FindByNameItem implements UserAction {

    public int key() {
        return 5;
    }

    public void execute(Input input, Tracker tracker) {
        String key = input.ask("Введите имя заявки :");
        Item[] items = tracker.findByName(key);
        for (Item item : items) {
            System.out.println(item);
        }
    }
    public String info() {
        return "Find items by name";
    }
}
