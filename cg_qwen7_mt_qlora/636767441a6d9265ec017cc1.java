import java.util.*;

public class Generated_636767441a6d9265ec017cc1 {
    /**Perform a right node rotation on the AVL tree.**/
    private TreeNode<T> rotateRight(TreeNode<T> node){
        if(node == null || node.getLeft() == null) return node;
        
        // Perform the rotation.
        TreeNode<T> newRoot = node.getLeft();
        node.setLeft(newRoot.getRight());
        newRoot.setRight(node);
        
        // Update heights.
        updateHeight(node);
        updateHeight(newRoot);
        
        return newRoot;
    }
}