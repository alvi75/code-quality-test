import java.util.*;

public class Generated_636767441a6d9265ec017cc1 {
    private TreeNode<T> rotateRight(TreeNode<T> node){

		if(node == null || node.rightChild() == null){
			return node;
		}

		TreeNode<T> left = node.leftChild();
		TreeNode<T> pivot = node.rightChild();

		node.setLeftChild(rotateLeft(left));
		pivot.setLeftChild(node);

		return pivot;

	}
}