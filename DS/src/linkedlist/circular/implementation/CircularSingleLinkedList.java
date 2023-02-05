package linkedlist.circular.implementation;

import linkedlist.implementation.SingleLinkedListNode;

public class CircularSingleLinkedList {

    private SingleLinkedListNode head;
    private SingleLinkedListNode tail;
    private int size;


    public SingleLinkedListNode getHead() {
        return head;
    }

    public void setHead(SingleLinkedListNode head) {
        this.head = head;
    }

    public SingleLinkedListNode getTail() {
        return tail;
    }

    public void setTail(SingleLinkedListNode tail) {
        this.tail = tail;
    }

    /**
     * To create a circular single linked list
     *
     * @param value the node value
     */
    public CircularSingleLinkedList(int value) {
        head = new SingleLinkedListNode();
        SingleLinkedListNode node = new SingleLinkedListNode();
        node.setValue(value);
        node.setNext(node);
        head = node;
        tail = node;
        size++;

    }

    public SingleLinkedListNode add(int value, int location) {

        if (!isCircularSingleLinkedListExists()) {
            System.out.println("LinkedList does not exists");
            return head;
        }
        SingleLinkedListNode node = new SingleLinkedListNode();
        node.setValue(value);
        if (location == 0) {

            node.setNext(head);
            head = node;
            tail.setNext(node);

        } else if (location >= size) {
            tail.setNext(node);
            tail = node;
            tail.setNext(head);
        } else {
            SingleLinkedListNode tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.getNext();
                index++;
            }
            node.setNext(tempNode.getNext());
            tempNode.setNext(node);
        }
        size++;
        return head;
    }

    public void traversal(SingleLinkedListNode head) {
        if (null == head) {
            System.out.println("LinkedList does not exists");
            return;
        }
        SingleLinkedListNode tempNode = head;
        System.out.println("-----------------");
        for (int i = 0; i < size; i++) {

            System.out.println(tempNode.getValue() + " ");
            tempNode = tempNode.getNext();


        }
    }

    public void search(int value) {
        if (!isCircularSingleLinkedListExists()) {
            System.out.println("LinkedList does not exists");
            return;
        }
        SingleLinkedListNode tempNode = head;
        for (int i = 0; i < size; i++) {
            if (value == tempNode.getValue()) {
                System.out.println("Value : " + tempNode.getValue() + " found at position " + i);
                return;
            }
            tempNode = tempNode.getNext();
        }

    }

    public void deleteNode(int value) {

        if (!isCircularSingleLinkedListExists()) {
            System.out.println("LinkedList does not exists");
            return;
        }

        SingleLinkedListNode tempNode = head;
        SingleLinkedListNode prevNode = head;
        for (int i = 0; i < size; i++) {
            if (value == tempNode.getValue()) {
                if (size == 1) {
                    deleteCircularLinkedList();
                    return;
                }
                // if location is 0
                if (i == 0) {

                    head = head.getNext();
                    tail.setNext(head);
                    size--;
                    if (size == 0) {
                        head = tail = null;
                    }
                    return;
                } else if (i == size - 1) {

                    tempNode.setNext(head);
                    tail = tempNode;
                    size--;
                    if (size == 0) {
                        head = tail = null;
                    }
                    return;
                } else {
                    // need ref of previous , if its delete by element , if its by index , not required
                    prevNode.setNext(tempNode.getNext());
                    size--;
                }

            }
            prevNode = tempNode;
            tempNode = tempNode.getNext();
        }


    }

    public boolean isCircularSingleLinkedListExists() {
        return head != null;
    }

    public void deleteCircularLinkedList() {
        head = tail = null;
    }


}
