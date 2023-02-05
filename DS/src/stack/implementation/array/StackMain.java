package stack.implementation.array;

public class StackMain {
    public static void main(String[] args) {
        Stack stack= new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.traversal();
        System.out.println("Popped element: "+stack.pop());
        System.out.println("Popped element: "+stack.pop());
        System.out.println("Peek element: "+stack.peek());
        stack.traversal();
        stack.deleteStack();
        stack.traversal();
    }
}
