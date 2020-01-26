package ru.job4j.jun.collection.list;

public interface SimpleList<E> {

    void add(E data);

    E delete();

    int getCount();

    E get(int index);
}