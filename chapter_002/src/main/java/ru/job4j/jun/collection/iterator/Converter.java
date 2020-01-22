package ru.job4j.jun.collection.iterator;
import java.util.Iterator;

public class Converter {
    Iterator<Integer> iterator = null;

    Iterator<Integer> convert(Iterator<Iterator<Integer>> it) {
        if (!iterator.hasNext()) {
            iterator = it.next();
        }
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                if (it.hasNext() && !iterator.hasNext()) {
                    iterator = it.next();
                }
                return iterator.hasNext();
            }
            @Override
            public Integer next() {
                if (!iterator.hasNext()) {
                    iterator = it.next();
                }
                return iterator.next();
            }
        };

    }
}