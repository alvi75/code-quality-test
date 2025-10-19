import java.util.*;

public class Generated_6367675c1a6d9265ec01805b {
    public void removeFromTreeEdgeList(){
		if (prev == null) {
			if (next != null)
				next.prev = null;
			else
				treeEdgeList = null;
		} else {
			prev.next = next;
			if (next != null)
				next.prev = prev;
		}
		prev = null;
		next = null;
	}
}