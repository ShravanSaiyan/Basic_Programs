package linkedlist.doubly.implementation;

public class DoublyLinkedListNode {
    private int value;
    private DoublyLinkedListNode prev;
    private DoublyLinkedListNode next;


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public DoublyLinkedListNode getPrev() {
        return prev;
    }

    public void setPrev(DoublyLinkedListNode prev) {
        this.prev = prev;
    }

    public DoublyLinkedListNode getNext() {
        return next;
    }

    public void setNext(DoublyLinkedListNode next) {
        this.next = next;
    }


}
