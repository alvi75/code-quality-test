import java.util.*;

public class Generated_636767441a6d9265ec017cc1 {
    /**
 * Perform a right node rotation on the AVL tree.
**/
private TreeNode<T> rotateRight(TreeNode<T> node){
        TreeNode<T> temp = node.left;
        node.left = temp.right;
        if(node.left != null) node.left.parent = node;
        temp.parent = node.parent;
        if(temp.parent == null) root = temp;
        else if(temp.parent.left == node) temp.parent.left = temp;
        else temp.parent.right = temp;
        temp.right = node;
        node.parent = temp;
        return temp;
    }
}