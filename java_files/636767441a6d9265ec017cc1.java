import java.util.*;

public class Generated_636767441a6d9265ec017cc1 {
    /**
     * Perform a right node rotation on the AVL tree.
     */
    private TreeNode<T> rotateRight(TreeNode<T> node) {
        TreeNode<T> left = node.left;
        TreeNode<T> leftLeft = left.left;
        TreeNode<T> leftRight = left.right;

        // Rotate
        left.right = node;
        node.left = leftLeft;
        node.right = leftRight;

        // Update heights
        updateHeight(node);
        updateHeight(left);

        return left;
    }
}