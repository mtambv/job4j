package ru.job4j.tracker;

public class FindByNameItem extends BaseAction {
    public FindByNameItem  (int key, String name) {
        super(key, name);
    }

    public void execute(Input input, Tracker tracker) {
        String key = input.ask("Введите имя заявки :");
        Item[] items = tracker.findByName(key);
        for (Item item : items) {
            System.out.println(item);
        }
    }
}

