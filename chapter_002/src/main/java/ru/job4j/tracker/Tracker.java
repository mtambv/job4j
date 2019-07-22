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
    private  Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод реализаущий добавление заявки в хранилище
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
     * @return Уникальный ключ.
     */
    public String generateId() {
        String uniqueId = String.valueOf(System.nanoTime());
        return uniqueId;
    }
    /**должен заменить ячейку в массиве this.items. Для этого необходимо найти ячейку в
    * массиве по id. Метод должен вернуть boolean результат - удалось ли провести операцию.
    */
    public boolean replace(String id, Item item) {
        boolean didReplace = false;
        int n = 0;
        Item[] temp = new Item[n];
        for (Item s : items) {
            if (id.equals(items[n])) {
              items[n] =item;
            }
        }
        if (temp.length == items.length) {
            didReplace = true;
        }

        return didReplace;
    }
    /**должен удалить ячейку в массиве this.items. Для этого необходимо найти ячейку в
     массиве по id.  Далее сместить все значения справа от удаляемого элемента - на одну
     ячейку влево с помощью System.arrayCopy(). Метод должен вернуть boolean результат -удалось ли провести операцию.
     */
    public boolean delete(String id) {
        boolean didDelete = false;
        int n = 0;
        Item[] temp = new Item[n];
        for (Item s : items) {
            if (id.equals(items[n])) {
                n--;
            }
        }
        if (temp.length < items.length) {
            didDelete = true;
        }
        return didDelete;
    }

    /**
     * возвращает копию массива this.items без null элементов
     */
    public Item[] findAll(Item item)  {
        Item[] refinedArray = new Item [items.length];
        int count = -1;
        for(Item s : items) {
            if(s != null) {
                refinedArray[++count] = s;
            }
        }
        items = Arrays.copyOf(refinedArray, count + 1);
        return items;
    }
    /**  проверяет в цикле все элементы массива this.items, сравнивая name (используя метод
    * getName класса Item) с аргументом метода String key. Элементы, у которых совпадает
    * name, копирует в результирующий массив и возвращает его
    */
    public Item[] findByName(String key) {
        int n =0;
        Item[] temp = new Item [n];
        for(Item s : items) {
            if(key.equals(items[n])) {
                n++;
            }
        }
    return temp;
    }
    /**проверяет в цикле все элементы массива this.items, сравнивая id с аргументом String id и
     *возвращает найденный Item. Если Item не найден - возвращает null
     * @return
     */
    public Item[] findById(String id) {
        int n =0;
        Item[] temp = new Item [n];
        for(Item s : items) {
            if(id.equals(items[n])) {
                n++;
            }
        }
        return temp;
    }
    }


