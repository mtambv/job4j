package ru.job4j.tracker;

public class DeleteItem implements UserAction {
    public int key() {
        return 3;
    }

    public void execute(Input input, Tracker tracker) {
        String id = input.ask("Введите id заявки :");
        if (tracker.delete(id)) {
            System.out.println("------ итем удален -------");
        } else {
            System.out.println("-------итем не найден ---------");
        }
    }
    public String info() {
        return "Delete item";
    }
}
