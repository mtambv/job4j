package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определять по полю приоритет.
     * Для вставик использовать add(int index, E value)
     * @param
     */
    public void put(Task task) {
        int  count = tasks.size();
        if (tasks.isEmpty() ||
                tasks.getLast().getPriority() <= task.getPriority()) {
            this.tasks.add(task);
        } else {
            for (int index = 0; index < count; index++) {
                if (task.getPriority() < tasks.get(index).getPriority()) {
                    tasks.add(index, task);
                    break;
                }
            }
        }
    }
    public Task take() {
        return this.tasks.poll();
    }

}
