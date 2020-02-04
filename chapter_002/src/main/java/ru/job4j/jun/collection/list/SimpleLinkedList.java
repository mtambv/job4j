package ru.job4j.jun.collection.list;

import java.util.NoSuchElementException;

public class SimpleLinkedList<E> implements SimpleList<E> {
    private int size;
    private Node<E> first;

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
        if (size > 0) {
            this.first = this.first.next;
        } else {
            this.first = null;
        }
        size--;
        return data;
    }

    @Override
    public int getCount() {
        return size;
    }
}