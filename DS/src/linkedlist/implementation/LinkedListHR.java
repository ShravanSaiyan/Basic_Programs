package linkedlist.implementation;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LinkedListHR {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }


    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }


    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);

        if (null != llist) {
            node.next = llist;
        }
        llist = node;
        return llist;

    }
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        if(null == head){
            head = new SinglyLinkedListNode(data);
            return head;
        }
        SinglyLinkedListNode lastNode=head;
        while (null!=lastNode.next){
            lastNode=lastNode.next;
        }
        lastNode.next=node;
        return head;


    }
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {


        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        SinglyLinkedListNode tempNode=head;
        int index=0;
        while(index<position-1){
            tempNode=tempNode.next;
            index++;
        }
        SinglyLinkedListNode nextNode=tempNode.next;
        tempNode.next=node;
        node.next=nextNode;
        return head;


    }
    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {


        SinglyLinkedListNode prev=null;
        SinglyLinkedListNode tempNode=head;

        if(position==0){
            head=tempNode.next;
            return head;
        }
        int index=0;

        while(index<position-1){
            prev=tempNode;
            tempNode=tempNode.next;
            index++;
        }
        if(null!=prev){
            prev.next=tempNode.next;
        }


        return head;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        SinglyLinkedList llist = new SinglyLinkedList();

        int llistCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < llistCount; i++) {
            int llistItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            SinglyLinkedListNode llist_head = insertNodeAtTail(llist.head, llistItem);

            llist.head = llist_head;
        }


        printSinglyLinkedList(llist.head, "\n", bufferedWriter);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}


