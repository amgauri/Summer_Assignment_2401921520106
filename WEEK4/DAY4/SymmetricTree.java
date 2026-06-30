package WEEK4.DAY4;

public class SymmetricTree {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;

        return mirror(root.left, root.right);
    }

    private boolean mirror(TreeNode leftSide, TreeNode rightSide) {
        if (leftSide == null && rightSide == null) return true;
        if (leftSide == null || rightSide == null) return false;

        if (leftSide.val != rightSide.val) return false;

        return mirror(leftSide.left, rightSide.right) &&
               mirror(leftSide.right, rightSide.left);
    }

    public static void main(String[] args) {
        SymmetricTree obj = new SymmetricTree();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        System.out.println(obj.isSymmetric(root));
    }
}
