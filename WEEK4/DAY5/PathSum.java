package WEEK4.DAY5;

public class PathSum {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;

        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }

        int leftAmount = targetSum - root.val;

        return hasPathSum(root.left, leftAmount) ||
               hasPathSum(root.right, leftAmount);
    }

    public static void main(String[] args) {
        PathSum obj = new PathSum();

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);

        System.out.println(obj.hasPathSum(root, 22));
    }
}