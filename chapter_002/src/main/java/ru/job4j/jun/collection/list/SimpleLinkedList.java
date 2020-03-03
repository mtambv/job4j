package ru.job4j.jun.collection.list;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
public class SimpleLinkedList<T> {


    private int size = 0;
    private int modCount = 0;
    private Node<T> first;
    private Node<T> last;


    public SimpleLinkedList() {
    }

    public void add(T item) {
        Node<T> prev = last;
        Node<T> newNode = new Node<>(prev, item, null);
        last = newNode;
        if (prev == null) {
            first = newNode;
        } else {
            prev.next = newNode;
        }
        size++;
        modCount++;
    }

    public T get(int index) {
        outBounds(index);
        Node<T> result = null;
        Node<T> temp = first;
        for (int pos = 0; pos < size; pos++) {
            if (index == pos) {
                result = temp;
                break;
            }
            temp = temp.next;
        }
        return result.item;
    }

    private void outBounds(int index) throws IndexOutOfBoundsException {
        if (index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }

    public Iterator<T> iterator() {
        return new SimpleLinkedList.Itr();
    }

    private class Itr implements Iterator<T> {
        int cursor = 0;
        int expectedModCount = modCount;

        @Override
        public boolean hasNext() {
            checkForModifications();
            boolean valid = false;
            if (cursor < size) {
                valid = true;
            }
            return valid;
        }

        @Override
        public T next() throws IndexOutOfBoundsException {
            checkForModifications();
            if (!hasNext()) {
                throw new IndexOutOfBoundsException();
            }
            int i = cursor;
            T next = get(i);
            cursor = i + 1;
            return next;
        }

        private void checkForModifications() throws ConcurrentModificationException {
            if (expectedModCount != modCount) {
                throw new ConcurrentModificationException();
            }
        }
    }

    private static class Node<T> {
        T item;
        Node<T> next;
        Node<T> prev;

        public Node(Node<T> prev, T item, Node<T> next) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }
    }
}