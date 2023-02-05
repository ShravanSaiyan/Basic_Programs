package stack.implementation.linkedlist;

public class StackLinkedListMain {
    public static void main(String[] args) {
        StackLinkedList stackLinkedList = new StackLinkedList();
        stackLinkedList.insert(10);
        stackLinkedList.insert(20);
        stackLinkedList.insert(30);
        stackLinkedList.insert(40);
        stackLinkedList.traversal();
        System.out.println("popped element: " + stackLinkedList.pop());
        System.out.println("popped element: " + stackLinkedList.pop());
        stackLinkedList.traversal();
        System.out.println("peek element: " + stackLinkedList.peek());
        stackLinkedList.traversal();
        stackLinkedList.deleteStack();
        stackLinkedList.traversal();

    }
}
