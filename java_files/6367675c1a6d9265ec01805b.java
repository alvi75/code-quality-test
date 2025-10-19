import java.util.*;

public class Generated_6367675c1a6d9265ec01805b {
    /**Remove this edge from both doubly linked lists of the tree edges.**/
public void removeFromTreeEdgeList(){
		if (this.previous != null){
			this.previous.next = this.next;
		}
		else{
			this.treeEdgeList.head = this.next;
		}
		
		if (this.next != null){
			this.next.previous = this.previous;
		}
		else{
			this.treeEdgeList.tail = this.previous;
		}
		
		this.previous = null;
		this.next = null;
	}
}