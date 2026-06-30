package WEEK4.DAY4;

public class BinaryTreeMaximumPathSum {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    private int bestSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        gain(root);
        return bestSum;
    }

    private int gain(TreeNode node) {
        if (node == null) return 0;

        int leftGain = Math.max(0, gain(node.left));
        int rightGain = Math.max(0, gain(node.right));

        int currentPath = node.val + leftGain + rightGain;
        bestSum = Math.max(bestSum, currentPath);

        return node.val + Math.max(leftGain, rightGain);
    }

    public static void main(String[] args) {
        BinaryTreeMaximumPathSum obj = new BinaryTreeMaximumPathSum();

        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(obj.maxPathSum(root));
    }
}
