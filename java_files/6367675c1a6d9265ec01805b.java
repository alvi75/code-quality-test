import java.util.*;

public class Generated_6367675c1a6d9265ec01805b {
    /**
 * Remove this edge from both doubly linked lists of the tree edges.
 **/
public void removeFromTreeEdgeList(){
		if (this.treeEdgePrev != null){
			this.treeEdgePrev.treeEdgeNext = this.treeEdgeNext;
		}
		if (this.treeEdgeNext != null){
			this.treeEdgeNext.treeEdgePrev = this.treeEdgePrev;
		}
		this.treeEdgePrev = null;
		this.treeEdgeNext = null;
	}
}