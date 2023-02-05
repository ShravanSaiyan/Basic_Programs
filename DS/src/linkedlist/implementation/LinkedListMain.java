package linkedlist.implementation;

public class LinkedListMain {
    public static void main(String[] args) {
        SingleLinkedList linkedList = new SingleLinkedList();

        linkedList.createLinkedList(1);

        linkedList.add(3,1);
        linkedList.add(5,2);
        linkedList.add(7,3);
        linkedList.add(6,4);

        System.out.println("After adding: " +linkedList.getSize());
        linkedList.traversal();

        linkedList.searchValue(5);

        linkedList.deleteNodeByValue(1);

        linkedList.traversal();

        System.out.println("After deleting element: " +linkedList.getSize());

        /*linkedList.deleteLinkedList();

        linkedList.traversal();

        System.out.println("After deleting element: " +linkedList.getSize());*/



    }
}
