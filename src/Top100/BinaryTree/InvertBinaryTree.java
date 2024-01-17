package Top100.BinaryTree;

/*Given the root of a binary tree, invert the tree, and return its root.*/


import com.sun.source.tree.Tree;

import java.util.ArrayList;

public class InvertBinaryTree {
    public static void main(String[] args) {

        InvertBinaryTree binaryTree = new InvertBinaryTree();
        int[] root = new int[] {4,2,7,1,3,6,9};
        binaryTree.buildTree(root);
        binaryTree.invertTree(new TreeNode());
    }

    public TreeNode buildTree(int[] root) {
        //We will need to first create the tree
        //todo Should I have a tree where to append all the others? We need a return statement
        TreeNode tree = new TreeNode();


        for (int i = 0; i < root.length; i++) {

            //todo Pensar com haig de crear l arbre per a que el detecti, un cop creat sera canviar els nodes recursivament
            if (i < 1) {
                tree = new TreeNode(root[i]);
            }
            else if (i+1 < root.length) {
                TreeNode newTree = new TreeNode(root[i]);
                newTree.val = root[i];
                newTree.left = new TreeNode(root[i-1]);
                newTree.right = new TreeNode(root[i+1]);

                tree.right = new TreeNode(newTree.val,newTree.left,newTree.right);
            }
        }
        return new TreeNode();
    }
    public ArrayList<Integer> invertTree (TreeNode root) {

        return null;
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