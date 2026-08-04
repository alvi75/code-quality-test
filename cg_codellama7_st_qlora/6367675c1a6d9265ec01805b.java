import java.util.*;

public class Generated_6367675c1a6d9265ec01805b {
    public void removeFromTreeEdgeList(){
		if(this.leftEdge != null){
			this.leftEdge.rightEdge = this.rightEdge;
		}
		if(this.rightEdge != null){
			this.rightEdge.leftEdge = this.leftEdge;
		}
		this.leftEdge = null;
		this.rightEdge = null;
	}
}