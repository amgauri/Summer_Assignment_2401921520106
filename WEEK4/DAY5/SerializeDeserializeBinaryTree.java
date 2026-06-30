package WEEK4.DAY5;

import java.util.ArrayDeque;
import java.util.Queue;

public class SerializeDeserializeBinaryTree {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public String serialize(TreeNode root) {
        StringBuilder data = new StringBuilder();
        buildString(root, data);
        return data.toString();
    }

    private void buildString(TreeNode node, StringBuilder data) {
        if (node == null) {
            data.append("#,");
            return;
        }

        data.append(node.val).append(",");
        buildString(node.left, data);
        buildString(node.right, data);
    }

    public TreeNode deserialize(String data) {
        String[] values = data.split(",");
        Queue<String> queue = new ArrayDeque<>();

        for (String value : values) {
            queue.offer(value);
        }

        return buildTree(queue);
    }

    private TreeNode buildTree(Queue<String> queue) {
        String value = queue.poll();

        if (value.equals("#")) return null;

        TreeNode node = new TreeNode(Integer.parseInt(value));
        node.left = buildTree(queue);
        node.right = buildTree(queue);

        return node;
    }

    static void preorder(TreeNode root) {
        if (root == null) {
            System.out.print("# ");
            return;
        }

        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        SerializeDeserializeBinaryTree obj = new SerializeDeserializeBinaryTree();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        String saved = obj.serialize(root);
        System.out.println(saved);

        TreeNode rebuilt = obj.deserialize(saved);
        preorder(rebuilt);
    }
}