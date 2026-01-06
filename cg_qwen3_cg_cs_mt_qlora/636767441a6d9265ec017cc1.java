import java.util.*;

public class Generated_636767441a6d9265ec017cc1 {
    /**
 * Perform a right node rotation on the AVL tree.
 **/
private TreeNode<T> rotateRight(TreeNode<T> node){
        TreeNode<T> left = node.left;
        TreeNode<T> leftRight = left.right;

        //perform rotation
        left.right = node;
        node.left = leftRight;

        //update heights
        node.height = Math.max(getHeight(node.left), getHeight(node.right)) + 1;
        left.height = Math.max(getHeight(left.left), getHeight(left.right)) + 1;

        return left;
    }
}