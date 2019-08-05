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
     * @param input ввод данных.
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
            case 0 : this.createItem();
                break;
            case 1 : this.showAllItems();
                 break;
            case 2 : this.editItem();
                break;
            case 3 : this.deleteItem();
                break;
            case 4 : this.findItemById();
                break;
            case 5 : this.findItemByName();
                break;
            case 6 : exit = true;
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
        Item item = new Item(name, desc);
        this.tracker.add(item);
        System.out.println("------------ Новая заявка с getId : " + item.getId() + "-----------");
    }
    private void showAllItems() {
        this.tracker.findAll(Item item);
    }
    private void editItem() {
        this.tracker.replace(String id, Item item);
    }
    private void deleteItem() {
        this.tracker.delete(String id);
    }
    private void findItemById() {
        this.tracker.findById (String id);
    }
    private void findItemByName() {
        this.tracker.findByName(String key);
    }

    private void showMenu() {
        System.out.print("Меню.\n 0. Add new Item \n 1. Show all items\n 2. Edit item \n " +
                "3.Delete item \n 4. Find item by Id \n 5. Find items by name \n 6. Exit Program \n Select: ");

    }

    /**
     * Запускт программы.
     * @param args
     */
    public static void main(String[] args) {
        ConsoleInput input = new ConsoleInput();
        Tracker tracker = new Tracker();
        String name = input.ask("Please enter the task's name:");
        //tracker.add(new Task (name, "first desc"));
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }
}