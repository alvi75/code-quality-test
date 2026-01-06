import java.util.*;

public class Generated_636767441a6d9265ec017cc1 {
    /**
 * Perform a right node rotation on the AVL tree.
 */ 
    private TreeNode<T> rotateRight(TreeNode<T> node) {
        TreeNode<T> left = node.left;
        node.left = left.right;
        if (left.right != null)
            left.right.parent = node;
        left.parent = node.parent;
        if (node.parent == null)
            root = left;
        else if (node == node.parent.left)
            node.parent.left = left;
        else
            node.parent.right = left;
        left.right = node;
        node.parent = left;
        return left;
    }
}