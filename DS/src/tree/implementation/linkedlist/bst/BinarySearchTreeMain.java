package tree.implementation.linkedlist.bst;

public class BinarySearchTreeMain {
    public static void main(String[] args) {

        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(100);
        binarySearchTree.insert(80);
        binarySearchTree.insert(40);
        binarySearchTree.insert(60);
        binarySearchTree.insert(70);
        binarySearchTree.insert(90);
        binarySearchTree.search(9);
        binarySearchTree.traversal("levelOrder");
        binarySearchTree.delete(80);
        binarySearchTree.traversal("levelOrder");

    }

}
