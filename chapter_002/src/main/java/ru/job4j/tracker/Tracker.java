package ru.job4j.tracker;

import java.util.Arrays;

/**
 * @version $Id$
 * @since 0.1
 */
public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод реализаущий добавление заявки в хранилище
     *
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */
    public String generateId() {
        String uniqueId = String.valueOf(Math.random() * System.nanoTime());
        return uniqueId;
    }

    /**
     * должен заменить ячейку в массиве this.items. Для этого необходимо найти ячейку в
     * массиве по id. Метод должен вернуть boolean результат - удалось ли провести операцию.
     */
    public boolean replace(String id, Item item) {
        for (position = 0; position < items.length; position++) {
            if (items[position].getId().equals(id)) {
                items[position] = item;
            }
        }
        if (id == null
                || item == null
                || position < 0
                || position >= items.length) {return false;
        }
        else return true;
    }

    /**
     * должен удалить ячейку в массиве this.items. Для этого необходимо найти ячейку в
     * массиве по id.  Далее сместить все значения справа от удаляемого элемента - на одну
     * ячейку влево с помощью System.arrayCopy(). Метод должен вернуть boolean результат -удалось ли провести операцию.
     */
    public boolean delete(String id) {
        Item[] temp = new Item[items.length - 1];
        for (int i = 0, k = 0; i < items.length; i++) {
            if (id.equals(items[i])) {
                continue;
            }
            temp[k++] = items[i];
        }
        if (id == null
                || position < 0
                || position >= items.length) {return false;
        }
        else return true;
    }
    /**
     * возвращает копию массива this.items без null элементов
     */
    public Item[] findAll(Item item) {
        return Arrays.copyOf(this.items, this.position);
    }

    public Item findByName(String key) {
        for (position = 0; position < items.length; position++) {
            if (key.equals(items[position]))
                break;
        }
        return items[position];
    }
        /**проверяет в цикле все элементы массива this.items, сравнивая id с аргументом String id и
         *возвращает найденный Item. Если Item не найден - возвращает null
         * @return
         */
        public Item findById (String id) {
            for (position = 0; position < items.length; position++) {
                if (id.equals(items[position]))
                    break;
            }
            return items[position];
        }
    }


