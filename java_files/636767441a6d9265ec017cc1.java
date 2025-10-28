import java.util.*;

public class Generated_636767441a6d9265ec017cc1 {
    private TreeNode<T> rotateRight(TreeNode<T> node) {
        TreeNode<T> parent = node.getParent();
        TreeNode<T> grandParent = node.getGrandparent();

        if (grandParent == null) {
            return node;
        }

        if (node.isLeftChild()) {
            node.setLeftChild(rotateLeft(node.getLeftChild()));
        } else {
            node.setRightChild(rotateLeft(node.getRightChild()));
        }

        if (node.getParent() != null) {
            if (node.isLeftChild()) {
                node.getParent().setLeftChild(node);
            } else {
                node.getParent().setRightChild(node);
            }
        }

        updateHeight(node);

        return node;
    }
}