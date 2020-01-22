package ru.job4j.jun.collection.generic;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class SimpleArray<T> implements Iterable<T> {
    private Object[] data;
    private Integer count = 0;

    public SimpleArray(int size) {
        this.data = new Object[size];
    }

    public void add(T element) {
        if (count == data.length) {
            throw new ArrayStoreException();
        }
        data[count++] = element;
    }

    public T get(int index) {
        return (T) data[index];
    }

    public void set(int index, T element) {
        if (index >= count && index < 0) {
            throw new IndexOutOfBoundsException();
        }
        data[index] = element;
    }

    public void remove(int index) {
        if (index >= count && index < 0) {
            throw new IndexOutOfBoundsException();
        }
        System.arraycopy(data, index + 1, data, index, data.length - 1 - index);
        count--;
    }

    public Integer getCount() {
        return count;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(data, count));
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < count;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return (T) data[index++];
            }
        };
    }
}