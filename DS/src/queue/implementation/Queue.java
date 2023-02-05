package queue.implementation;

import java.util.stream.IntStream;

public class Queue {

    private int topOfQueue;
    private int beginningOfQueue;
    private int[] a;
    private int queueSize;

    public Queue(int size) {
        a = new int[size];
        topOfQueue = -1;
        beginningOfQueue = -1;
        size = 0;

    }

    public void enQueue(int value) {
        if (isFull()) {
            System.out.println("Queue is Full");
            return;
        } else if (isEmpty()) {
            beginningOfQueue = 0;
            a[++topOfQueue] = value;
        } else {
            a[++topOfQueue] = value;
        }
        queueSize++;
    }

    public void deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        } else {

            System.out.println("Element dequeued: " + a[beginningOfQueue]);
            beginningOfQueue++;
            queueSize--;
            if (beginningOfQueue > topOfQueue) {
                beginningOfQueue = topOfQueue = -1;
                queueSize = 0;
            }

        }

    }

    public void printQueue() {

        IntStream.rangeClosed(0, topOfQueue).map(i -> a[i]).forEach(System.out::println);

    }

    private boolean isFull() {
        return queueSize == a.length;
    }

    private boolean isEmpty() {
        return queueSize == 0;
    }
}
