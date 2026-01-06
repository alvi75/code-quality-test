import java.util.*;

public class Generated_636767441a6d9265ec017cc1 {
    /**Perform a right node rotation on the AVL tree.*/
    private TreeNode<T> rotateRight(TreeNode<T> node){
        TreeNode<T> left = node.left;
        if(left == null) return node;

        //Rotate
        node.left = left.right;
        left.right = node;

        //Update heights
        updateHeight(node);
        updateHeight(left);

        return left;
    }
}