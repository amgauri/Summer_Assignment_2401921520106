package WEEK4.DAY2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> answer = new ArrayList<>();
        if (root == null) return answer;

        Queue<TreeNode> line = new ArrayDeque<>();
        line.offer(root);

        while (!line.isEmpty()) {
            int size = line.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode node = line.poll();
                level.add(node.val);

                if (node.left != null) line.offer(node.left);
                if (node.right != null) line.offer(node.right);
            }

            answer.add(level);
        }

        return answer;
    }

    public static void main(String[] args) {
        BinaryTreeLevelOrderTraversal obj = new BinaryTreeLevelOrderTraversal();

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(obj.levelOrder(root));
    }
}