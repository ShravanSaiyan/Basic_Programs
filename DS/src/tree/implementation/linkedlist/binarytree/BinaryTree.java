package tree.implementation.linkedlist.binarytree;

import java.util.LinkedList;
import java.util.Queue;

import static tree.implementation.linkedlist.util.TreeUtil.*;

public class BinaryTree {
    private TreeNode root;

    public BinaryTree() {
        root = null;
    }


    void search(int value) {
        Queue<TreeNode> treeNodeQueue = new LinkedList<>();
        treeNodeQueue.add(root);
        while (!treeNodeQueue.isEmpty()) {
            TreeNode currentNode = treeNodeQueue.remove();
            if (value == currentNode.getData()) {
                System.out.println("Value found: " + currentNode.getData());
                return;
            }
            if (null != currentNode.getLeft()) {
                treeNodeQueue.add(currentNode.getLeft());
            }
            if (null != currentNode.getRight()) {
                treeNodeQueue.add(currentNode.getRight());
            }
        }
        System.out.println("Value not found");
    }

    void insertNode(int value) {
        TreeNode treeNode = new TreeNode();
        treeNode.setData(value);
        if (null == root) {
            root = treeNode;
            System.out.println("Successfully inserted new node at Root !");
            return;
        }
        Queue<TreeNode> treeNodeQueue = new LinkedList<>();
        treeNodeQueue.add(root);
        while (!treeNodeQueue.isEmpty()) {
            TreeNode currentNode = treeNodeQueue.remove();
            if (null == currentNode.getLeft()) {
                currentNode.setLeft(treeNode);
                System.out.println("Value " + value + " inserted to the left");
                return;
            }
            if (null == currentNode.getRight()) {
                currentNode.setRight(treeNode);
                System.out.println("Value " + value + " inserted to the right");
                return;
            }
            treeNodeQueue.add(currentNode.getLeft());
            treeNodeQueue.add(currentNode.getRight());
        }

    }

    private TreeNode getDeepestNode() {

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        TreeNode presentNode = null;
        while (!queue.isEmpty()) {
            presentNode = queue.remove();
            if (presentNode.getLeft() != null)
                queue.add(presentNode.getLeft());
            if (presentNode.getRight() != null)
                queue.add(presentNode.getRight());
        }
        return presentNode;
    }

    private void deleteDeepestNode() {
        Queue<TreeNode> treeNodeQueue = new LinkedList<>();
        treeNodeQueue.add(root);
        TreeNode previousNode;
        TreeNode currentNode = null;
        while (!treeNodeQueue.isEmpty()) {
            previousNode = currentNode;
            currentNode = treeNodeQueue.remove();
            if (null == currentNode.getLeft()) {
                previousNode.setRight(null);
                return;
            }
            if (null == currentNode.getRight()) {
                currentNode.setLeft(null);
                return;
            }
            treeNodeQueue.add(currentNode.getLeft());
            treeNodeQueue.add(currentNode.getRight());
        }
    }

    public void deleteNode(int value) {
        Queue<TreeNode> treeNodeQueue = new LinkedList<>();
        treeNodeQueue.add(root);
        while (!treeNodeQueue.isEmpty()) {
            TreeNode presentNode = treeNodeQueue.remove();
            if (value == presentNode.getData()) {
                presentNode.setData(getDeepestNode().getData());
                deleteDeepestNode();
                System.out.println("Value deleted: " + value);
                return;
            }
            if (presentNode.getLeft() != null)
                treeNodeQueue.add(presentNode.getLeft());
            if (presentNode.getRight() != null)
                treeNodeQueue.add(presentNode.getRight());
        }
        System.out.println("Node not found");

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
