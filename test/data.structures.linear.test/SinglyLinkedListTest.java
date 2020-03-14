package data.structures.linear.test;

import data.structures.linear.SinglyLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SinglyLinkedListTest {
    @Test
    public void isEmptySuccessWhenEmpty() {
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        assertTrue(list.isEmpty());
    }

    @Test
    public void isEmptyFalseWhenNotEmpty() {
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        list.addLast("A");
        assertFalse(list.isEmpty());
    }

    @Test
    public void addLastFailWhenAddingNullValue() {
        assertThrows(IllegalArgumentException.class, () -> {
            SinglyLinkedList<String> list = new SinglyLinkedList<String>();
            list.addLast(null);
        });
    }
}
