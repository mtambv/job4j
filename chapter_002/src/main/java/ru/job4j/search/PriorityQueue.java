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
    public void put(Task newTask) {
        if (tasks.isEmpty() ||
                tasks.getLast().getPriority() <= newTask.getPriority()) {
            this.tasks.add(newTask);
        } else {
            for (Task task : tasks) {
                if (newTask.getPriority() < task.getPriority()) {
                    this.tasks.add(tasks.indexOf(task), newTask);
                    break;
                } else if (newTask.getPriority() == task.getPriority()) {
                    this.tasks.add(tasks.indexOf(task) + 1, newTask);
                    break;
                }
            }
        }
    }
    public Task take() {
        return this.tasks.poll();
    }

}
