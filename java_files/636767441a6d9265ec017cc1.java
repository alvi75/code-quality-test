import java.util.*;

public class Generated_636767441a6d9265ec017cc1 {
    private TreeNode<T> rotateRight(TreeNode<T> node) {
		if(node == null || node.left == null)
			return node;
		TreeNode<T> left = node.left;
		TreeNode<T> leftLeft = left.left;
		TreeNode<T> leftRight = left.right;

		left.setLeft(leftLeft);
		node.setRight(rightRotate(leftRight));

		return rightRotate(node);
	}
}