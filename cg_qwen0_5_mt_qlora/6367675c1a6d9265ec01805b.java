import java.util.*;

public class Generated_6367675c1a6d9265ec01805b {
    /**Remove this edge from both doubly linked lists of the tree edges.**/
    public void removeFromTreeEdgeList(){
        if (left != null) left.right = right;
        else root = right;
        if (right != null) right.left = left;
        else root = left;
        left = null;
        right = null;
    }
}