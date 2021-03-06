package ru.job4j.jun.collection.list;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ConcurrentModificationException;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class SimpleArrayTest {
    SimpleList<Integer> list;

    @Before
    public void init() {
        list = new SimpleArray<>();
        list.add(1);
        list.add(2);
        list.add(3);
    }

    @Test
    public void whenAddThenResize() {
        list.add(4);
        assertThat(list.toString(), is("[1, 2, 3, 4]"));
    }

    @Test
    public void whenGetThenThree() {
        assertThat(list.get(2), is(3));
    }

    @Test
    public void whenIterateThenGetAllContent() {
        StringBuilder sb = new StringBuilder();
        for (int element : list) {
            sb.append(element);
        }
        assertThat(sb.toString(), is("123"));
    }

    @Test(expected = ConcurrentModificationException.class)
    public void whenAddDuringIterateThenException() {
        for (int element : list) {
            if (element < 3) {
                list.add(3);
            }
        }
    }
}