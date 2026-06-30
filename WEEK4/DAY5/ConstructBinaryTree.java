package WEEK4.DAY5;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTree {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    private int preorderIndex = 0;
    private Map<Integer, Integer> inorderPlace = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            inorderPlace.put(inorder[i], i);
        }

        return build(preorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] preorder, int left, int right) {
        if (left > right) return null;

        int rootValue = preorder[preorderIndex++];
        TreeNode root = new TreeNode(rootValue);

        int middle = inorderPlace.get(rootValue);

        root.left = build(preorder, left, middle - 1);
        root.right = build(preorder, middle + 1, right);

        return root;
    }

    static void inorderPrint(TreeNode root) {
        if (root == null) return;

        inorderPrint(root.left);
        System.out.print(root.val + " ");
        inorderPrint(root.right);
    }

    public static void main(String[] args) {
        ConstructBinaryTree obj = new ConstructBinaryTree();

        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};

        TreeNode root = obj.buildTree(preorder, inorder);

        inorderPrint(root);
    }
}