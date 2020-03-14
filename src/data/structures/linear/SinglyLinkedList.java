/**
 * Copyright 2020
 */
package data.structures.linear;

public class SinglyLinkedList<T> {
    private Node<T> first = null;

    public boolean isEmpty() {
        return this.first == null;
    }

    public void addLast(T value) {
        if (value == null) {
            throw new IllegalArgumentException("value cannot be null");
        }
        if (first == null) {
            this.first = new Node<>();
            this.first.value = value;
        }
    }

    private static class Node<T> {
        T value;
        Node<T> next = null;
    }
}
