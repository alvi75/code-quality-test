import java.util.*;

public class Generated_636767441a6d9265ec017cc1 {
    /**Perform a right node rotation on the AVL tree.**/
    private TreeNode<T> rotateRight(TreeNode<T> node){
        // Perform the rotation.
        TreeNode<T> newRoot = node.left;
        node.left = newRoot.right;
        newRoot.right = node;

        // Update heights.
        node.height = Math.max(getHeight(node.left), getHeight(node.right)) + 1;
        newRoot.height = Math.max(getHeight(newRoot.left), getHeight(newRoot.right)) + 1;

        return newRoot;
    }
}