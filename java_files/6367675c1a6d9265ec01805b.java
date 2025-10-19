import java.util.*;

public class Generated_6367675c1a6d9265ec01805b {
    public void removeFromTreeEdgeList(){
		if ( leftChild != null ) {
			leftChild.rightSibling = rightSibling;
		}
		if( rightSibling != null ){
			rightSibling.leftSibling = leftSibling;
		}
	}
}