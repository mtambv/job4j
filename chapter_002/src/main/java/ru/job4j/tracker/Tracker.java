package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

/**
 * @version $Id$
 * @since 0.1
 */
public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private List<Item> items = new ArrayList<>();

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
        this.items.add(item);
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
        boolean res = false;
        for (int i = 0; i < position; i++) {
            if (this.items.get(i).getId().equals(id)) {
                item.setId(id);
                res = true;
                break;
            }
        }
        return res;
    }

    /**
     * должен удалить ячейку в массиве this.items. Для этого необходимо найти ячейку в
     * массиве по id.  Далее сместить все значения справа от удаляемого элемента - на одну
     * ячейку влево с помощью System.arrayCopy(). Метод должен вернуть boolean результат -удалось ли провести операцию.
     */
    public boolean delete(String id) {
        boolean result = false;
        for (int i = 0; i < this.items.size(); i++) {
            if (this.items.get(i).getId().equals(id)) {
                this.items.remove(i);
                System.arraycopy(items, i + 1, items, i, position - i);
                position--;
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * возвращает копию массива this.items без null элементов
     *
     * @return
     */
    public List<Item> findAll() {
            return this.items;
        }

        public List<Item> findByName (String key){
            List<Item> listOfNames = new ArrayList<>();
            for (Item item : this.items) {
                if (item.getName().equals(key)) {
                    listOfNames.add(item);
                }
            }
            return listOfNames;
        }


    /**
     * проверяет в цикле все элементы массива this.items, сравнивая id с аргументом String id и
     * возвращает найденный Item. Если Item не найден - возвращает null
     *
     * @return
     */
    public Item findById(String id) {
        Item result = null;
        for (Item item : this.items) {
            if (item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }
}


