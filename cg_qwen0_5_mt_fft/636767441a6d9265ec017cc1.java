import java.util.*;

public class Generated_636767441a6d9265ec017cc1 {
    private TreeNode<T> rotateRight(TreeNode<T> node) {
        TreeNode<T> r = new TreeNode<T>(node.key, node.right, null);
        node.right = node.left;
        node.left = r;
        return r;
    }
}