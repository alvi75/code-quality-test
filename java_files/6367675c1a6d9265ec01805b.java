import java.util.*;

public class Generated_6367675c1a6d9265ec01805b {
    /**Remove this edge from both doubly linked lists of the tree edges.**/
    public void removeFromTreeEdgeList(){
        if (treeEdges != null) {
            treeEdges.remove(this);
        }
        if (edgeList != null) {
            edgeList.remove(this);
        }
    }
}