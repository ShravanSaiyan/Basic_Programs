package queue.implementation;

public class QueueMain {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
        queue.printQueue();

        queue.deQueue();
        queue.printQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();

    }
}
