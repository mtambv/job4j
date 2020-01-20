package ru.job4j.jun.collection.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class EvenNumbersIterator implements Iterator {
    private int[] data;
    private Integer index = 0;

    public  EvenNumbersIterator(int[] data) {
        this.data = data;
    }

    @Override
    public boolean hasNext() {

        boolean rsl = index < data.length;
        if (rsl && !isEven(data[index])) {
            rsl = false;
            while (index < data.length) {
                if (isEven(data[index])) {
                    rsl = true;
                    break;
                }
                index++;
            }
        }
        return rsl;
    }

    @Override
    public Object next() {
        if (data.length == index) {
            throw new NoSuchElementException();
        }
        return data[index++];
    }

    private static boolean isEven(int n) {
        return n % 2 == 0;
    }
}