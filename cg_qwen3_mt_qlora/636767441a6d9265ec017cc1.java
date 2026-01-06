import java.util.*;

public class Generated_636767441a6d9265ec017cc1 {
    private TreeNode<T> rotateRight(TreeNode<T> node){
        if (node == null) {
            return null;
        }
        TreeNode<T> left = node.left;
        TreeNode<T> right = left.right;

        // Perform rotation
        left.right = node;
        node.left = right;

        // Update heights
        node.height = Math.max(getHeight(node.left), getHeight(node.right)) + 1;
        left.height = Math.max(getHeight(left.left), getHeight(left.right)) + 1;

        // Return new root
        return left;
    }
}