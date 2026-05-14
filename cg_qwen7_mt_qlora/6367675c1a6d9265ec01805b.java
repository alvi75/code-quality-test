import java.util.*;

public class Generated_6367675c1a6d9265ec01805b {
    /**Remove this edge from both doubly linked lists of the tree edges.*/
    public void removeFromTreeEdgeList(){
        if (parent != null) {
            parent.child = next;
        }
        if (next != null){
            next.parent = parent;
        }
        parent = null;
        child = null;
        next = null;
    }
}