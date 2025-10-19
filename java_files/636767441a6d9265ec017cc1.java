import java.util.*;

public class Generated_636767441a6d9265ec017cc1 {
    private TreeNode<T> rotateRight(TreeNode<T> node){
		if(node == null)
			return null;
		
		TreeNode<T> parent = node.getParent();
		if(parent == null){
			return node;
		}
		else{
			//if this is not the left child of the parent, then we need to fix up the pointers.
			if(!node.isLeftChildOfParent()){
				node.setLeftChild(parent.getRightChild());
				parent.setRightChild(node);
			}
			
			//set new parent pointer
			parent.setParent(node);
			
			//fix up the pointers in the new node
			if(node.getLeftChild() != null){
				node.getLeftChild().setParent(node);
			}
			if(node.getRightChild() != null){
				node.getRightChild().setParent(node);
			}
			
			//now that everything has been fixed up, set the children
			node.setLeftChild(parent);
			node.setRightChild(node.getLeftChild());
			node.getLeftChild().setRightChild(node);
			
			//return the new node
			return node;
		}
	}
}