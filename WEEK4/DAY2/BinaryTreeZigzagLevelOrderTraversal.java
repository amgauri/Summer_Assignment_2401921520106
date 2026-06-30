package WEEK4.DAY2;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigzagLevelOrderTraversal {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> answer = new ArrayList<>();
        if (root == null) return answer;

        Queue<TreeNode> line = new ArrayDeque<>();
        line.offer(root);

        boolean leftToRight = true;

        while (!line.isEmpty()) {
            int size = line.size();
            LinkedList<Integer> level = new LinkedList<>();

            for (int i = 0; i < size; i++) {
                TreeNode node = line.poll();

                if (leftToRight) {
                    level.addLast(node.val);
                } else {
                    level.addFirst(node.val);
                }

                if (node.left != null) line.offer(node.left);
                if (node.right != null) line.offer(node.right);
            }

            answer.add(level);
            leftToRight = !leftToRight;
        }

        return answer;
    }

    public static void main(String[] args) {
        BinaryTreeZigzagLevelOrderTraversal obj = new BinaryTreeZigzagLevelOrderTraversal();

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(obj.zigzagLevelOrder(root));
    }
}