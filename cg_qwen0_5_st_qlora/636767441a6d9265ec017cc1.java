import java.util.*;

public class Generated_636767441a6d9265ec017cc1 {
    private TreeNode<T> rotateRight(TreeNode<T> node){
		if(node == null) return null;
		node.left = rotateLeft(node.left);
		return rotate(node);
	}
}