package ru.job4j.jun.collection.iterator;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Converter {
    Iterator<Integer> iterator = null;

    Iterator<Integer> convert(Iterator<Iterator<Integer>> it) {
        if (!iterator.hasNext()) {
            iterator = it.next();
        }
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                while (it.hasNext()) {
                    if (!iterator.hasNext()) {
                        iterator = it.next();
                    } else {
                        break;
                    }
                }
                return iterator.hasNext();
            }

            @Override
            public Integer next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return iterator.next();
            }

        };
    }
}