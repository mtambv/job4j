package ru.job4j.jun.collection.generic;

import java.util.function.Consumer;

public class GeneralStore<T extends Base> implements Store<T> {
    private SimpleArray<T> data;

    public GeneralStore(SimpleArray<T> data) {
        this.data = data;
    }

    @Override
    public void add(T model) {
        data.add(model);
    }

    @Override
    public boolean replace(String id, T model) {
        return findThenDo(id, (x) -> data.set(x, model));
    }

    @Override
    public boolean delete(String id) {
        return findThenDo(id, (x) -> data.remove(x));
    }

    @Override
    public T findById(String id) {
        T element = null;
        for (int i = 0; i < data.getCount(); i++) {
            if (id.equals(data.get(i).getId())) {
                element = data.get(i);
                break;
            }
        }
        return element;
    }

    private boolean findThenDo(String id, Consumer<Integer> consumer) {
        boolean result = false;
        for (int i = 0; i < data.getCount(); i++) {
            if (id.equals(data.get(i).getId())) {
                consumer.accept(i);
                result = true;
                break;
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}