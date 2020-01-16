package ru.job4j.jun.collection.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MatrixIterator implements Iterator {
    private final int[][] data;
    private int y = 0;
    private int x = 0;

    public MatrixIterator(final int[][] data) {
        this.data = data;
    }

    @Override
    public boolean hasNext() {
        if (data[y].length == x) {
            x = 0;
            y++;
        }
        return data.length > y;
    }

    @Override
    public Object next() {

        if (data.length == y) {
            throw new NoSuchElementException();
        }

        if (data[y].length == x) {
            x = 0;
            y++;
        }
        return data[y][x++];
    }
}