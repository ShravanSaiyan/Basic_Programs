package linkedlist.implementation;

public class SingleLinkedList {

    private SingleLinkedListNode head;
    private SingleLinkedListNode tail;
    private int size;

    public SingleLinkedListNode getHead() {
        return head;
    }

    public void setHead(SingleLinkedListNode head) {
        this.head = head;
    }

    public SingleLinkedListNode getTail() {
        return tail;
    }

    public void setTail(SingleLinkedListNode tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public SingleLinkedListNode createLinkedList(int nodeValue) {
        head = new SingleLinkedListNode();
        SingleLinkedListNode node = new SingleLinkedListNode();
        node.setValue(nodeValue);
        node.setNext(null);
        head = node;
        tail = node;
        size++;
        return head;
    }

    public void add(int value, int location) {

        SingleLinkedListNode node = new SingleLinkedListNode();
        node.setValue(value);
        if (!isLinkedListExists()) {
            System.out.println("LinkedList does not exists");
            return;
        } else if (location == 0) {
            node.setNext(head);
            head = node;
        } else if (location >= size) {
            tail.setNext(node);
            tail = node;
        } else {
            SingleLinkedListNode tempNode = head; // getting the prev node
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.getNext();
                index++;
            }
            SingleLinkedListNode nextNode = tempNode.getNext();
            tempNode.setNext(node);
            node.setNext(nextNode);
        }
        size++;
    }

    public boolean isLinkedListExists() {
        return head != null;
    }

    public void traversal() {
        if (!isLinkedListExists()) {
            System.out.println("LinkedList does not exists");
            return;
        }
        SingleLinkedListNode tempNode = head;

        while (null != tempNode) {
            System.out.println(tempNode.getValue());
            tempNode = tempNode.getNext();


        }
    }

    public void searchValue(int nodeValue) {
        if (!isLinkedListExists()) {
            System.out.println("LinkedList does not exists");
            return;
        }
        SingleLinkedListNode tempNode = head;
        for (int i = 0; i < getSize(); i++) {
            if (nodeValue == tempNode.getValue()) {
                System.out.println("The value: " + nodeValue + " found at position " + i);
                return;
            }
            tempNode = tempNode.getNext();
        }
        System.out.println("Value not found");

    }

    public void deletionOfNodeByLocation(int location) {
        if (!isLinkedListExists()) {
            System.out.println("The linked list does not exist!!");// Linked List does not exists
            return;
        } else if (location == 0) { // we want to delete first element
            head = head.getNext();
            setSize(getSize() - 1);
            if (getSize() == 0) { // if there are no more nodes in this list
                tail = null;
            }
        } else if (location >= getSize()) { //If location is not in range or equal, then delete last node
            SingleLinkedListNode tempNode = head;
            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.getNext(); //temp node points to 2nd last node
            }
            if (tempNode == head) { //if this is the only element in the list
                tail = head = null;
                setSize(getSize() - 1);
                return;
            }
            tempNode.setNext(null);
            tail = tempNode;
            setSize(getSize() - 1);

        } else { //if any inside node is to be deleted
            SingleLinkedListNode tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.getNext(); // we need to traverse till we find the location
            }
            tempNode.setNext(tempNode.getNext().getNext()); // delete the required node
            setSize(getSize() - 1);
        }//end of else

    }//end of method

    public void deleteNodeByValue(int nodeValue) {
        if (!isLinkedListExists()) {
            System.out.println("LinkedList does not exists");
            return;
        }


        SingleLinkedListNode tempNode = head;
        SingleLinkedListNode prev = null;

        if (nodeValue == tempNode.getValue()) {
            head = tempNode.getNext();
            size--;
        }

        for (int i = 0; i < getSize(); i++) {
            if (tempNode.getValue() == nodeValue) {

                if (i == getSize() - 1) {
                    tail = prev;
                    size--;
                    return;
                } else if (null != prev) {

                    prev.setNext(tempNode.getNext());
                    size--;
                }


            }
            prev = tempNode;
            tempNode = tempNode.getNext();
        }


    }

    public void deleteLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
}
