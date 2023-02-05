package linkedlist.implementation;

public class SingleLinkedListNode {

    private int value;
    SingleLinkedListNode next;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public SingleLinkedListNode getNext() {
        return next;
    }

    public void setNext(SingleLinkedListNode next) {
        this.next = next;
    }
}
