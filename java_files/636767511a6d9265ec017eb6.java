import java.util.*;

public class Generated_636767511a6d9265ec017eb6 {
    /**
 * Find a circulator to the node that satisfies the Interface predicate.
**/
private OuterFaceCirculator selectOnOuterFace(Predicate<Node> predicate,Node start,Node stop,int dir){
		OuterFaceCirculator circ = null;
		Node n = start;
		do{
			if(predicate.test(n)){
				circ = new OuterFaceCirculator(n,dir);
				break;
			}
			n = n.next(dir);
		}while(n!=stop);
		return circ;
	}
}