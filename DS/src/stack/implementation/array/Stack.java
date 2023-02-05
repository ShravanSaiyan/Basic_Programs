package stack.implementation.array;

public class Stack {
    static final int MAX = 1000;
    private int top;


    int[] a = new int[MAX];

    public Stack() {
        top = -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }

        a[++top] = value;
    }

    public void traversal() {
        if (isEmpty()) {
            System.out.println("Empty Stack");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.println("Element at index " + i + " " + a[i]);
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Empty Stack");
            return 0;
        }

        return a[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Empty Stack");
            return 0;
        }

        return a[top];
    }

    public boolean isFull() {
        return top >= MAX - 1;
    }

    public boolean isEmpty() {
        return top < 0;
    }

    void deleteStack() {
        a = null;
        top = -1;
    }


}



