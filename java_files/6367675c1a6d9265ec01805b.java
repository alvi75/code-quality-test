import java.util.*;

public class Generated_6367675c1a6d9265ec01805b {
    public void removeFromTreeEdgeList(){
		if (parent != null) {
			parent.removeChild(this);
		}
		if (child != null) {
			child.removeChild(this);
		}
	}
}