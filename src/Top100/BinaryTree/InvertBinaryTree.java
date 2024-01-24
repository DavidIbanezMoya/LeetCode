package Top100.BinaryTree;

/*Given the root of a binary tree, invert the tree, and return its root.*/


import com.sun.source.tree.Tree;

import java.util.ArrayList;

public class InvertBinaryTree {
    public static void main(String[] args) {

        InvertBinaryTree binaryTree = new InvertBinaryTree();
        int[] root = new int[] {4,2,7,1,3,6,9};
        TreeNode inverted = binaryTree.buildTree(root);
    }

    public TreeNode buildTree(int[] root) {
        //We will need to first create the tree
        if (root == null) {
            return null;

        }
        TreeNode rootTreeNode = new TreeNode(root[0]);
        TreeNode current = rootTreeNode;

        for (int i = 1; i < root.length; i++) {
            current.left = new TreeNode(root[i]);
            current = current.left;
        }

        invertTree(rootTreeNode);
        return rootTreeNode;
    }
    public void invertTree (TreeNode root) {

        if (root == null) {
            return;
        }

        TreeNode auxiliar = root.left;
        root.left = root.right;
        root.right = auxiliar;

        invertTree(root.left);
        invertTree(root.right);

    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}