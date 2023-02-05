package tree.implementation.linkedlist.bst;

import tree.implementation.linkedlist.binarytree.TreeNode;

import static tree.implementation.linkedlist.util.TreeUtil.*;

public class BinarySearchTree {

    TreeNode root;

    public BinarySearchTree() {
        root = null;

    }

    private TreeNode createNewNode(int value) {
        TreeNode treeNode = new TreeNode();
        treeNode.setData(value);
        return treeNode;
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    private TreeNode insert(TreeNode root, int value) {
        if (null == root) {
            return createNewNode(value);
        } else if (value <= root.getData()) {
            System.out.println("Inserting to the left " + root.getData());
            root.setLeft(insert(root.getLeft(), value));
            return root;
        } else {
            System.out.println("Inserting to the right " + root.getData());
            root.setRight(insert(root.getRight(), value));
            return root;
        }
    }

    public void delete(int value) {
        delete(root, value);
    }

    private TreeNode delete(TreeNode root, int value) {
        if (null == root) {
            System.out.println("Value not found");
            return null;
        }
        if (value < root.getData()) {
            root.setLeft(delete(root.getLeft(), value));
        } else if (value > root.getData()) {
            root.setRight(delete(root.getRight(), value));
        } else {
            if (null != root.getLeft() && null != root.getRight()) {

                TreeNode minimumElement = minimumElement(root.getRight());
                root.setData(minimumElement.getData());
                root.setRight(delete(root.getRight(), minimumElement.getData()));
            } else if (root.getLeft() != null) {// if nodeToBeDeleted has only left child
                root = root.getLeft();
            } else if (root.getRight() != null) {// if nodeToBeDeleted has only right child
                root = root.getRight();
            } else // if nodeToBeDeleted do not have child (Leaf node)
                root = null;
        }
        return root;
    }// end of method

    public void deleteBST() {
        root = null;
    }

    private TreeNode minimumElement(TreeNode root) {
        if (null == root.getLeft()) {
            return root;
        } else {

            return minimumElement(root.getLeft());
        }
    }

    public void search(int value) {
        search(root, value);
    }

    private TreeNode search(TreeNode root, int value) {
        if (null == root) {
            System.out.println("Value " + value + " not found");
            return null;
        } else if (value == root.getData()) {
            System.out.println("Value " + value + " found");
            return root;
        } else if (value < root.getData()) {
            return search(root.getLeft(), value);
        } else {
            return search(root.getRight(), value);
        }
    }

    public void traversal(String traversalMode) {
        switch (traversalMode) {
            case "preOrder":
                System.out.println("PreOrder traversal");
                preOrder(root);
                System.out.println();
                break;
            case "postOrder":
                System.out.println("PostOrder traversal");
                postOrder(root);
                System.out.println();
                break;
            case "inOrder":
                System.out.println("InOrder traversal");
                inOrder(root);
                System.out.println();
                break;
            default:
                System.out.println("Level Order");
                levelOrder(root);
                System.out.println();
                break;
        }
    }
}
