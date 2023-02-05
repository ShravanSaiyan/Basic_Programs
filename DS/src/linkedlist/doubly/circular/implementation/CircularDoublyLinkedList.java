package linkedlist.doubly.circular.implementation;

import linkedlist.doubly.implementation.DoublyLinkedListNode;

public class CircularDoublyLinkedList {
    private DoublyLinkedListNode head;
    private DoublyLinkedListNode tail;
    private int size;

    public DoublyLinkedListNode getHead() {
        return head;
    }

    public void setHead(DoublyLinkedListNode head) {
        this.head = head;
    }

    public DoublyLinkedListNode getTail() {
        return tail;
    }

    public void setTail(DoublyLinkedListNode tail) {
        this.tail = tail;
    }

    public CircularDoublyLinkedList(int value) {

        head = new DoublyLinkedListNode();
        DoublyLinkedListNode node = new DoublyLinkedListNode();
        node.setValue(value);
        head = node;
        tail = node;
        node.setPrev(node);
        node.setNext(node);
        size++;
    }

    public DoublyLinkedListNode add(int value, int location) {
        if (isCircularDoublyLinkedListExists()) {
            System.out.println("LinkedList does not exists");
            return head;
        }
        DoublyLinkedListNode node = new DoublyLinkedListNode();
        node.setValue(value);
        if (location == 0) {

            node.setNext(head);
            node.setPrev(tail);
            head.setPrev(node);
            tail.setNext(node);
            head = node;
            size++;
            return head;

        } else if (location >= size) {

            node.setPrev(tail);
            node.setNext(head);
            tail.setNext(node);
            tail = node;
            head.setPrev(tail);

            size++;
            return head;

        } else {

            int index = 0;
            DoublyLinkedListNode tempNode = head;
            while (index < location - 1) {
                tempNode = tempNode.getNext();
                index++;
            }

            node.setPrev(tempNode);
            node.setNext(tempNode.getNext());
            tempNode.getNext().setPrev(node);
            tempNode.setNext(node);
            size++;
            return head;
        }

    }

    public void traversal() {
        System.out.println("--------------");
        DoublyLinkedListNode tempNode = head;
        for (int i = 0; i < size; i++) {
            System.out.println(tempNode.getValue());
            tempNode = tempNode.getNext();
        }
        System.out.println("--------------");

    }

    public void reversal() {
        System.out.println("--------------");
        DoublyLinkedListNode tempNode = tail;
        for (int i = 0; i < size; i++) {
            System.out.println(tempNode.getValue());
            tempNode = tempNode.getPrev();
        }
        System.out.println("--------------");
    }

    public void searchNode(int value) {

        DoublyLinkedListNode tempNode = head;
        for (int i = 0; i < size; i++) {
            if (value == tempNode.getValue()) {
                System.out.println(tempNode.getValue() + " found at position " + i);
            }
            tempNode = tempNode.getNext();
        }

    }

    public DoublyLinkedListNode delete(int value) {
        if (isCircularDoublyLinkedListExists()) {
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
                    head.getNext().setPrev(tail);
                    head=head.getNext();
                    tail.setNext(head);
                    size--;
                    return head;
                } else if (i == size - 1) {
                    tail.getPrev().setNext(head);
                    tail=tail.getPrev();
                    head.setPrev(tail);
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

    public boolean isCircularDoublyLinkedListExists() {
        return null == head;
    }
}
