import java.util.*;

public class Generated_6367675c1a6d9265ec01805b {
    /**Remove this edge from both doubly linked lists of the tree edges.**/
    public void removeFromTreeEdgeList(){
        if (this.prevInTreeEdgeList != null)
            this.prevInTreeEdgeList.nextInTreeEdgeList = this.nextInTreeEdgeList;
        if (this.nextInTreeEdgeList != null)
            this.nextInTreeEdgeList.prevInTreeEdgeList = this.prevInTreeEdgeList;
        this.prevInTreeEdgeList = null;
        this.nextInTreeEdgeList = null;
    }
}