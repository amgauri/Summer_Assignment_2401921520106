package WEEK4.DAY3;

public class LowestCommonAncestorBST {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (root != null) {
            if (p.val < root.val && q.val < root.val) {
                root = root.left;
            } else if (p.val > root.val && q.val > root.val) {
                root = root.right;
            } else {
                return root;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        LowestCommonAncestorBST obj = new LowestCommonAncestorBST();

        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);

        TreeNode p = root.left;
        TreeNode q = root.left.right;

        System.out.println(obj.lowestCommonAncestor(root, p, q).val);
    }
}