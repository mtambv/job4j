package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

/**
 * @version $Id$
 * @since 0.1
 */
public class StartUI {
    /**
     * Константа меню для добавления новой заявки.
     */
    private static final String ADD = "0";
    private static final String SHOWALL = "1";
    private static final String EDIT = "2";
    private static final String DELETE = "3";
    private static final String FINDBYNAME = "4";
    private static final String FINDBYID = "5";

    /**
     * Константа для выхода из цикла.
     */
    private static final String EXIT = "6";
    List<Integer> range = new ArrayList<>();
    /**
     * Получение данных от пользователя.
     */
    private final Input input;

    /**
     * Хранилище заявок.
     */
    private final Tracker tracker;

    /**
     * Конструтор инициализирующий поля.
     *
     * @param input   ввод данных.
     * @param tracker хранилище заявок.
     */
    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Основой цикл программы.
     */
    public void init() {
        MenuTracker menu = new MenuTracker(this.input, this.tracker);
        menu.fillActions();
        int [] ranges = menu.ranges();
        for (int i = 0; i < menu.getActionsLentgh(); i++) {
            range.add(i);
        }
        do {
            menu.show();
            menu.select(input.ask("select:", ranges));
        } while (!"y".equals(this.input.ask("Exit?(y): ")));
    }

        private boolean exit() {
        return true;
        }
    private void showMenu() {
        System.out.print("Меню.\n 0. Add new Item \n 1. Show all items\n 2. Edit item \n "
                + "3. Delete item \n 4. Find item by Id \n 5. Find items by name \n 6. Exit Program \n Select: ");

    }

        /**
         * Запускт программы.
         * @param args
         */
        public static void main(String[]args) {
            Input input = new ValidateInput (new ConsoleInput());
            new StartUI(input, new Tracker()).init ();
        }
    }
