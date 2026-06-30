package WEEK4.DAY3;
public class ValidateBST {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public boolean isValidBST(TreeNode root) {
        return check(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean check(TreeNode node, long low, long high) {
        if (node == null) return true;

        if (node.val <= low || node.val >= high) return false;

        return check(node.left, low, node.val) &&
               check(node.right, node.val, high);
    }

    public static void main(String[] args) {
        ValidateBST obj = new ValidateBST();

        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        System.out.println(obj.isValidBST(root));
    }
}