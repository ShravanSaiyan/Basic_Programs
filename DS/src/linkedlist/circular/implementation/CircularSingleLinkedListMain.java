package linkedlist.circular.implementation;

public class CircularSingleLinkedListMain {
    public static void main(String[] args) {
        CircularSingleLinkedList circularSingleLinkedList = new CircularSingleLinkedList(10);
        circularSingleLinkedList.add(10, 0);
        circularSingleLinkedList.add(30, 0);
        circularSingleLinkedList.add(40, 5);
        circularSingleLinkedList.add(50, 2);
        circularSingleLinkedList.search(40);
        circularSingleLinkedList.search(30);
        circularSingleLinkedList.traversal(circularSingleLinkedList.getHead());
        circularSingleLinkedList.deleteNode(30);
        circularSingleLinkedList.traversal(circularSingleLinkedList.getHead());
        circularSingleLinkedList.deleteNode(50);
        circularSingleLinkedList.traversal(circularSingleLinkedList.getHead());
        circularSingleLinkedList.deleteCircularLinkedList();
        circularSingleLinkedList.deleteNode(10);
        circularSingleLinkedList.traversal(circularSingleLinkedList.getHead());

    }
}
