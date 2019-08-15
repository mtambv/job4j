package ru.job4j.tracker;

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
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("Введите пункт меню : ");
            int select = Integer.parseInt(answer);
            switch (select) {
                case 0:
                    this.createItem();
                    break;
                case 1:
                    this.showAllItems();
                    break;
                case 2:
                    this.editItem();
                    break;
                case 3:
                    this.deleteItem();
                    break;
                case 4:
                    this.findItemById();
                    break;
                case 5:
                    this.findItemByName();
                    break;
                default:
                    exit = true;
            }
        }
    }

    /**
     * Метод реализует добавленяи новый заявки в хранилище.
     */
    private void createItem() {
        System.out.println("------------ Добавление новой заявки --------------");
        String name = this.input.ask("Введите имя заявки :");
        String desc = this.input.ask("Введите описание заявки :");
        long time = new java.util.Date().getTime();
        Item item = new Item(name, desc, time);
        this.tracker.add(item);
        System.out.println("------------ Новая заявка с getId : " + item.getId() + "-----------");
    }

    private void showAllItems() {
        System.out.println("------------ Displaying all items in the Tracker -----------");
        Item[] items = this.tracker.findAll();
        for (Item item : items) {
            System.out.println(item);
        }
    }

    private void editItem() {
        System.out.println("------------ Enter item you want to delete --------------");
        String name = this.input.ask("Введите имя заявки :");
        String id = this.input.ask("Enter id you wish to edit:");
        String desc = this.input.ask("Enter description you wish to edit:");
        long time = new java.util.Date().getTime();
        Item item = new Item(name, desc, time);
        if (this.tracker.replace(id, item)) {
            System.out.println("------ заявка обновлена_-------");
        } else {
            System.out.println("-------итем не найден ---------");
        }
    }

    private void deleteItem() {
        String id = this.input.ask("Введите id заявки :");
        if (this.tracker.delete(id)) {
            System.out.println("------ итем удален -------");
        } else {
            System.out.println("-------итем не найден ---------");
        }
    }

    private void findItemById() {
        String id = this.input.ask("Введите id заявки :");
        Item item = (this.tracker.findById(id));
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("-------итем не найден ---------");
        }
    }
        private void findItemByName() {
            String key = this.input.ask("Введите id заявки :");
            Item[] items = this.tracker.findByName(key);
            for (Item item : items) {
                System.out.println(item);
            }
        }

        private boolean exit() {
        return true;
        }

        private void showMenu() {
            System.out.print("Меню.\n 0. Add new Item \n 1. Show all items\n 2. Edit item \n "
                    + "3.Delete item \n 4. Find item by Id \n 5. Find items by name \n 6. Exit Program \n Select: ");

        }

        /**
         * Запускт программы.
         * @param args
         */
        public static void main(String[]args) {
            ConsoleInput input = new ConsoleInput();
            Tracker tracker = new Tracker();
            String name = input.ask("Please enter the task's name:");
            //tracker.add(new Task (name, "first desc"));
            new StartUI(new ConsoleInput(), new Tracker()).init();
        }
    }
