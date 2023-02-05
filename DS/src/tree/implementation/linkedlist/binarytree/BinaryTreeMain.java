package tree.implementation.linkedlist.binarytree;

public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insertNode(10);
        binaryTree.insertNode(20);
        binaryTree.insertNode(40);
        binaryTree.insertNode(60);
        binaryTree.insertNode(30);
        binaryTree.insertNode(80);
        binaryTree.insertNode(70);
        binaryTree.traversal("inOrder");
        binaryTree.traversal("preOrder");
        binaryTree.traversal("postOrder");
        binaryTree.traversal("level");
        binaryTree.search(80);
        binaryTree.search(100);
        binaryTree.deleteNode(20);
        binaryTree.traversal("level");


    }
}
