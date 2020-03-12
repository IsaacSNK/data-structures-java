/**
 * Copyright 2020
 */
package data.structures.linear;

public class SinglyLinkedList<T> {
    public Node<T> first = null;

    public static int CONSTANTE = 0;

    public boolean isEmpty() {
        return this.first == null;
    }

    private static class Node<T> {
        T value;
        Node<T> next;
    }
}
