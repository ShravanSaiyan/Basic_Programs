package linkedlist.doubly.implementation;

public class DoublyLinkedListMain {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(20);
        doublyLinkedList.add(10, 0);
        // doublyLinkedList.add(30, 0);
        doublyLinkedList.add(30, 5);
        doublyLinkedList.add(40, 4);
        doublyLinkedList.traversal();
        doublyLinkedList.reverse();
        doublyLinkedList.search(30);
        doublyLinkedList.search(20);
        //doublyLinkedList.delete(10);
        //doublyLinkedList.delete(40);
        doublyLinkedList.delete(30);

        doublyLinkedList.traversal();

    }
}
