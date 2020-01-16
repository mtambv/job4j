package ru.job4j.jun.collection.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class EvenNumbersIterator implements Iterator {
    private int[] data;
    private Integer index = 0;

    public EvenNumbersIterator(int[] data) {

        this.data = Arrays
                .stream(data)
                .filter(x -> x % 2 == 0)
                .toArray();
    }

    @Override
    public boolean hasNext() {
        return index < data.length;
    }

    @Override
    public Object next() {
        if (data.length == index) {
            throw new NoSuchElementException();
        }

        return data[index++];

    }
}