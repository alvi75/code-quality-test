import java.util.*;

public class Generated_636767441a6d9265ec017cc1 {
    public virtual TreeNode<T> RotateRight(TreeNode<T> node){TreeNode<T> left = node.Left;node.Left = left.Right;left.Right = node;node.Height = Math.Max(node.Left.Height, node.Right.Height) + 1;left.Height = Math.Max(left.Left.Height, node.Height) + 1;return left;}
}