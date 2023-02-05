package stack.implementation.linkedlist;

import linkedlist.implementation.SingleLinkedList;

import java.util.LinkedList;

public class StackLinkedList {

    private final SingleLinkedList list;

    StackLinkedList() {
        list = new SingleLinkedList();
        LinkedList<Integer> linkedList = new
                LinkedList<>();

    }

    void insert(int value) {

        if (null == list.getHead()) {
            list.createLinkedList(value);
        } else {
            list.add(value, 0);
        }
        System.out.println("Value " + value + " inserted in stack");

    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Empty Stack");
            return 0;
        } else {
            int value = -1;
            value = list.getHead().getValue();
            list.deletionOfNodeByLocation(0);
            return value;

        }

    }

    void traversal() {
        if (isEmpty()) {
            System.out.println("Empty Stack");
            return;
        }
        list.traversal();
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Empty Stack");
            return 0;
        } else {
            return list.getHead().getValue();
        }
    }

    void deleteStack() {
        list.setHead(null);
    }

    boolean isEmpty() {

        return null == list.getHead();
    }


}
