package WEEK4.DAY2;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        inorder(root, answer);
        return answer;
    }

    private void inorder(TreeNode node, List<Integer> answer) {
        if (node == null) return;

        inorder(node.left, answer);
        answer.add(node.val);
        inorder(node.right, answer);
    }

    public static void main(String[] args) {
        BinaryTreeInorderTraversal obj = new BinaryTreeInorderTraversal();

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        System.out.println(obj.inorderTraversal(root));
    }
}