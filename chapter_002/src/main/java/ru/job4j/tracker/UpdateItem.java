package ru.job4j.tracker;

public class UpdateItem implements UserAction {
    public int key() {
        return 2;
    }

    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Enter item you want to delete --------------");
        String id = input.ask("Enter id you wish to edit:");
        String name = input.ask("Введите имя заявки :");
        String desc = input.ask("Enter description you wish to edit:");
        long time = new java.util.Date().getTime();
        Item item = new Item(name, desc, time);
        if (tracker.replace(id, item)) {
            System.out.println("------ заявка обновлена_-------");
        } else {
            System.out.println("-------итем не найден ---------");
        }
    }
    public String info() {
        return "Edit item";
    }
}
