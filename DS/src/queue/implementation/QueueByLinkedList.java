package queue.implementation;

import linkedlist.implementation.SingleLinkedList;

public class QueueByLinkedList {
    SingleLinkedList singleLinkedList;

    public QueueByLinkedList() {
        singleLinkedList = new SingleLinkedList();
    }

    void enQueue(int value) {

        if (isEmpty()) {
            singleLinkedList.createLinkedList(value);
        } else {
            singleLinkedList.add(value, singleLinkedList.getSize());
        }
    }

    int deQueue() {
        int value = -1;
        if (isEmpty()) {
            System.out.println("Queue Empty");
        } else {
            value = singleLinkedList.getHead().getValue();
            singleLinkedList.deletionOfNodeByLocation(0);
        }
        return value;
    }

    int peek() {
        if (!isEmpty()) return singleLinkedList.getHead().getValue();
        System.out.println("The queue is empty!!");
        return -1;
    }

    void deleteQueue() {
        singleLinkedList.setHead(null);
    }

    boolean isEmpty() {
        return null == singleLinkedList.getHead();
    }
}
