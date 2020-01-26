package ru.job4j.jun.collection.list;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;


public class SimpleLinkedListTest {
    private SimpleLinkedList<Integer> list;

    @Before
    public void beforeTest() {
        list = new SimpleLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
    }

    @Test
    public void whenAddThreeElementsThenUseGetOneResultTwo() {
        assertThat(list.get(1), is(2));
    }

    @Test
    public void whenAddThreeElementsThenUseGetSizeResultThree() {
        assertThat(list.getCount(), is(3));
    }

    @Test
    public void whenDeleteSecondElementsThenUseGetOneResultTwo() {
        assertThat(list.delete(), is(3));
        assertThat(list.get(1), is(1));
    }
}