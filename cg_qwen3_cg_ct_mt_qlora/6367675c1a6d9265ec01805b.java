import java.util.*;

public class Generated_6367675c1a6d9265ec01805b {
    /**
* Remove this edge from both doubly linked lists of the tree edges.
**/
public void removeFromTreeEdgeList(){
if (this.prevInTree != null){
this.prevInTree.nextInTree = this.nextInTree;
}
if (this.nextInTree != null){
this.nextInTree.prevInTree = this.prevInTree;
}
this.prevInTree = null;
this.nextInTree = null;
}
}