package ru.job4j.jun.collection.list;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SimpleLinkedList<E> implements SimpleList<E> {
    private int size;
    private Node<E> first;

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    private static class Node<E> {
        E data;
        Node<E> next;

        Node(E data) {
            this.data = data;
        }
    }

    @Override
    public E get(int index) {
        Node<E> result = this.first;
        for (int i = 0; i < index; i++) {
            result = result.next;
        }
        return result.data;
    }

    @Override
    public void add(E data) {
        Node<E> newLink = new Node<>(data);
        newLink.next = this.first;
        this.first = newLink;
        size++;
    }

    @Override
    public E delete() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        E data = this.first.data;
        this.first = this.first.next;
        size--;
        return data;
    }

    @Override
    public int getCount() {
        return size;
    }
}