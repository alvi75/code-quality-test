import java.util.*;

public class Generated_636767441a6d9265ec017cc1 {
    private TreeNode<T> rotateRight(TreeNode<T> node) {
        //System.out.println("ROTATING RIGHT: " + node);
        TreeNode<T> newRoot = node.left;
        node.setLeft(newRoot.right);
        newRoot.setRight(node);
        return newRoot;
    }
}