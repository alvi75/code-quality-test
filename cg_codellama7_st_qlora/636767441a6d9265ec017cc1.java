import java.util.*;

public class Generated_636767441a6d9265ec017cc1 {
    private TreeNode<T> rotateRight(TreeNode<T> node){
        TreeNode<T> left = node.getLeft();
        node.setLeft(left.getRight());
        left.setRight(node);
        node.setHeight(Math.max(node.getHeight(), left.getHeight()) + 1);
        left.setHeight(Math.max(left.getHeight(), node.getHeight()) + 1);
        return left;
    }
}