package WEEK4.DAY1;

public class InvertBinaryTree {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        TreeNode savedLeft = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(savedLeft);

        return root;
    }

    static void preorder(TreeNode root) {
        if (root == null) return;

        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        InvertBinaryTree obj = new InvertBinaryTree();

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);

        TreeNode ans = obj.invertTree(root);
        preorder(ans);
    }
}