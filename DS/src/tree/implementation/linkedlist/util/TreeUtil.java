package tree.implementation.linkedlist.util;

import tree.implementation.linkedlist.binarytree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class TreeUtil {
    private TreeUtil() {
    }

    public static void preOrder(TreeNode node) {
        if (null == node) return;
        System.out.print(node.getData() + " ");
        preOrder(node.getLeft());
        preOrder(node.getRight());
    }

    public static void inOrder(TreeNode node) {
        if (null == node) return;
        inOrder(node.getLeft());
        System.out.print(node.getData() + " ");
        inOrder(node.getRight());
    }

    public static void postOrder(TreeNode node) {
        if (null == node) return;
        postOrder(node.getLeft());
        postOrder(node.getRight());
        System.out.print(node.getData() + " ");
    }

    public static void levelOrder(TreeNode node) {
        Queue<TreeNode> treeNodeQueue = new LinkedList<>();
        treeNodeQueue.add(node);
        while (!treeNodeQueue.isEmpty()) {
            TreeNode currentNode = treeNodeQueue.remove();
            System.out.print(" " + currentNode.getData());
            if (null != currentNode.getLeft()) {
                treeNodeQueue.add(currentNode.getLeft());
            }
            if (null != currentNode.getRight()) {
                treeNodeQueue.add(currentNode.getRight());
            }

        }

    }

}
