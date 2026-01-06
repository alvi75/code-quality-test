import java.util.*;

public class Generated_636767441a6d9265ec017cc1 {
    /**Perform a right node rotation on the AVL tree.**/
    private TreeNode<T> rotateRight(TreeNode<T> node){
        TreeNode<T> parent = node.parent;
        TreeNode<T> grandParent = parent.parent;

        if (grandParent == null) {
            return node;
        }

        TreeNode<T> uncle = getUncle(node);

        if (uncle != null && uncle.isLeftChild()) {
            // Left left case
            parent.left = uncle;
            uncle.right = parent;
        } else if (uncle != null && uncle.isRightChild()) {
            // Right right case
            parent.right = uncle;
            uncle.left = parent;
        } else {
            // Right left case
            parent.right = uncle;
            uncle.left = parent;
            uncle.right = grandParent;
            grandParent.left = uncle;
        }
        return parent;
    }
}