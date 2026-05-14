import java.util.*;

public class Generated_6367675c1a6d9265ec01805b {
    public void removeFromTreeEdgeList(){
		if (parent != null){
			parent.children.remove(this);
		}
		if (nextSibling != null){
			nextSibling.prevSibling = prevSibling;
		}
		if (prevSibling != null){
			prevSibling.nextSibling = nextSibling;
		} else {
			tree.root = nextSibling;
		}
	}
}