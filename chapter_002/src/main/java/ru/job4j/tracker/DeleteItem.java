package ru.job4j.tracker;

public class DeleteItem extends BaseAction {
    public DeleteItem(int key, String name) {
        super(key, name);
    }

    public void execute(Input input, Tracker tracker) {
        String id = input.ask("Введите id заявки :");
        if (tracker.delete(id)) {
            System.out.println("------ итем удален -------");
        } else {
            System.out.println("-------итем не найден ---------");
        }
    }
}
