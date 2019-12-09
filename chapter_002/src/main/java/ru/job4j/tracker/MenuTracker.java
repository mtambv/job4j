package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MenuTracker {
    /**
     * @param хранит ссылку на объект .
     */
    private Input input;
    /**
     * @param хранит ссылку на объект .
     */
    private Tracker tracker;
    /**
     * @param хранит ссылку на массив типа UserAction.
     */
    private List<UserAction> actions = new ArrayList<>();
    private final Consumer<String> output;
    /**
     * Конструктор.
     *
     * @param input   объект типа Input
     * @param tracker объект типа Tracker
     */
    public MenuTracker(Input input, Tracker tracker,Consumer<String> output) {
        this.input = input;
        this.tracker = tracker;
        this.output = output;
    }

    /**
     * Метод для получения массива меню.
     *
     * @return длину массива
     */
    public int getActionsLentgh() {
        return this.actions.size();
    }

    /**
     * Метод заполняет массив.
     */
    public void execute(Input input, Tracker tracker) {
        String id = input.ask("Введите id заявки :");
        String name = input.ask("Введите имя заявки :");
        String desc = input.ask("Enter description you wish to edit:");
    }


    public void fillActions() {
        this.actions.add(new AddItem(1, "test"));
        this.actions.add(new FindAllItem(1, "test"));
        this.actions.add(new UpdateItem(1, "test"));
        this.actions.add(new DeleteItem(1, "test"));
        this.actions.add(new FindItemById(1, "test"));
        this.actions.add(new FindByNameItem(1, "test"));
        this.actions.add(new ExitProgram());
    }

        public List<Integer> ranges() {
            List<Integer> range = new ArrayList<>();
            for (UserAction action : this.actions) {
                range.add(action.key());
            }
        return range;
    }

    /**
     * Метод в зависимости от указанного ключа, выполняет соотвествующие действие.
     *
     * @param key ключ операции
     */
    public void select(int key) {
        this.actions.get(key).execute(this.input, this.tracker);
    }

    /**
     * Метод выводит на экран меню.
     */
    public void show() {
        for (UserAction action : this.actions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }
}
