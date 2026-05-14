import java.util.*;

public class Generated_636767441a6d9265ec017cc1 {
    private TreeNode<T> rotateRight(TreeNode<T> node){
		if(node == null || node.getLeft() == null)
			return node;
		
		TreeNode<T> left = node.getLeft();
		node.setLeft(left.getRight());
		left.setRight(node);
		
		updateHeight(node);
		updateHeight(left);
		
		return left;
	}
}