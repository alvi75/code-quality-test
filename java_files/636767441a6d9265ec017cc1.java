import java.util.*;

public class Generated_636767441a6d9265ec017cc1 {
    private TreeNode<T> rotateRight(TreeNode<T> node){
		TreeNode<T> left = node.getLeft();
		TreeNode<T> mid = left.getRight();
		left.setRight(node);
		node.setLeft(mid);
		
		if(++size > 1)
			height = Math.max(height(node.getLeft()), height(node.getRight())) + 1;
		else
			height = 1;
		
		return left;
	}
}