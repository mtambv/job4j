package ru.job4j.tracker;

public class FindItemById implements UserAction {
    public int key() {
        return 4;
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
    public String info() {
        return "Find item by Id";
    }
}
