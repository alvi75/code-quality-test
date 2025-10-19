import java.util.*;

public class Generated_636767441a6d9265ec017cc1 {
    /**Perform a right node rotation on the AVL tree.**/
    private TreeNode<T> rotateRight(TreeNode<T> node){
        //System.out.println("rotateRight: " + node.data);
        TreeNode<T> left = node.left;
        if(left.right != null){
            node.left = left.right;
            left.right = node;
        }
        else{
            node.left = null;
            left.right = node;
        }
        return left;
    }
}