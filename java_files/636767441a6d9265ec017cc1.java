import java.util.*;

public class Generated_636767441a6d9265ec017cc1 {
    /**Perform a right node rotation on the AVL tree.**/
    private TreeNode<T> rotateRight(TreeNode<T> node){
        TreeNode<T> left = node.left;
        TreeNode<T> leftRight = left.right;

        // Perform rotation
        left.right = node;
        node.left = leftRight;

        // Return new root
        return left;
    }
}