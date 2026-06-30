package WEEK4.DAY3;

public class SearchInBST {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public TreeNode searchBST(TreeNode root, int val) {
        while (root != null) {
            if (root.val == val) return root;

            if (val < root.val) {
                root = root.left;
            } else {
                root = root.right;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        SearchInBST obj = new SearchInBST();

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        TreeNode found = obj.searchBST(root, 2);
        System.out.println(found == null ? "Not found" : found.val);
    }
}