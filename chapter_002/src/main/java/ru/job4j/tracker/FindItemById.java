package ru.job4j.tracker;

public class FindItemById extends BaseAction {
    public FindItemById(int key, String name) {
        super(key, name);
    }

    public void execute(Input input, Tracker tracker) {
        String id = input.ask("Введите id заявки :");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("-------итем не найден ---------");
        }
    }
}
