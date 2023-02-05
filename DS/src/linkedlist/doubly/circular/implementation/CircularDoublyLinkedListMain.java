package linkedlist.doubly.circular.implementation;

public class CircularDoublyLinkedListMain {
    public static void main(String[] args) {
        CircularDoublyLinkedList circularDoublyLinkedList = new CircularDoublyLinkedList(20);

        circularDoublyLinkedList.add(10, 0);
        circularDoublyLinkedList.add(40, 4);
        circularDoublyLinkedList.add(30, 2);
        circularDoublyLinkedList.traversal();
        circularDoublyLinkedList.reversal();
        circularDoublyLinkedList.searchNode(20);
        circularDoublyLinkedList.searchNode(40);
        circularDoublyLinkedList.delete(30);
        circularDoublyLinkedList.traversal();
    }
}
