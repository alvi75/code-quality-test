import java.util.*;

public class Generated_6367675c1a6d9265ec01805b {
    public void removeFromTreeEdgeList(){
		if (this.parent != null){
			this.parent.removeChild(this);
		}
		if (this.left != null){
			this.left.setParent(null);
		}
		if (this.right != null){
			this.right.setParent(null);
		}
	}
}