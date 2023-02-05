package linkedlist.doubly.implementation;

import java.awt.event.TextEvent;

public class DoublyLinkedList {

    public DoublyLinkedListNode head;
    public DoublyLinkedListNode tail;
    private int size;

    public DoublyLinkedList(int value) {
        head = new DoublyLinkedListNode();
        DoublyLinkedListNode node = new DoublyLinkedListNode();
        node.setValue(value);
        head = node;
        tail = node;
        size++;
    }

    public DoublyLinkedListNode add(int value, int location) {
        if (!isDoublyLinkedListExists()) {
            System.out.println("LinkedList does not exists");
            return head;
        }
        DoublyLinkedListNode node = new DoublyLinkedListNode();
        node.setValue(value);

        if (location == 0) {

            head.setPrev(node);
            node.setNext(head);
            head = node;
            size++;
            return head;
        } else if (location >= size) {
            node.setPrev(tail);
            tail.setNext(node);
            tail = node;
            size++;
            return head;
        } else {
            DoublyLinkedListNode tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.getNext();
                index++;
            }
            tempNode.setNext(node);
            node.setPrev(tempNode);
            node.setNext(tempNode.getNext());
            tempNode.getNext().setPrev(node);
            return head;
        }
    }

    public void traversal() {
        if (!isDoublyLinkedListExists()) {
            System.out.println("LinkedList does not exists");
            return;
        }
        DoublyLinkedListNode tempNode = this.head;
        System.out.println("-----------------");
        for (int i = 0; i < size; i++) {
            System.out.println(tempNode.getValue());
            tempNode = tempNode.getNext();
        }
        System.out.println("-----------------");

    }

    public void reverse() {
        if (!isDoublyLinkedListExists()) {
            System.out.println("LinkedList does not exists");
            return;
        }

        DoublyLinkedListNode tempNode = this.tail;

        System.out.println("-----------------");
        for (int i = 0; i < size; i++) {
            System.out.println(tempNode.getValue());
            tempNode = tempNode.getPrev();
        }
        System.out.println("-----------------");

    }

    public void search(int value) {
        if (!isDoublyLinkedListExists()) {
            System.out.println("LinkedList does not exists");
            return;
        }
        DoublyLinkedListNode tempNode = this.head;

        for (int i = 0; i < size; i++) {
            if (value == tempNode.getValue()) {
                System.out.println(tempNode.getValue() + " found at position " + i);
                return;
            }
            tempNode = tempNode.getNext();
        }


    }

    public DoublyLinkedListNode delete(int value) {
        if (!isDoublyLinkedListExists()) {
            System.out.println("LinkedList does not exists");
            return head;
        }
        DoublyLinkedListNode tempNode = head;
        for (int i = 0; i < size; i++) {
            if (value == tempNode.getValue()) {
                if (i == 0) {
                    if (size == 1) {
                        head = tail = null;
                        return null;
                    }
                    head.getNext().setPrev(null);
                    head = head.getNext();
                    size--;
                    return head;
                } else if (i == size - 1) {
                    tail.getPrev().setNext(tail);
                    tail = tail.getPrev();
                    size--;
                    return head;

                } else {
                    tempNode.getPrev().setNext(tempNode.getNext());
                    tempNode.getNext().setPrev(tempNode.getPrev());
                    size--;
                    return head;

                }
            }
            tempNode = tempNode.getNext();
        }
        return head;
    }

    public boolean isDoublyLinkedListExists() {
        return head != null;
    }

}
