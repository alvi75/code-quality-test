import java.util.*;

public class Generated_636767511a6d9265ec017eb6 {
    /**Find a circulator to the node that satisfies the Interface predicate.**/
private OuterFaceCirculator selectOnOuterFace(Predicate<Node> predicate,Node start,Node stop,int dir){
		OuterFaceCirculator circ = null;
		for(OuterFaceCirculator c : outerFaceCirculators) {
			if(c.getStart() == start && c.getStop() == stop && c.getDirection() == dir) {
				circ = c;
				break;
			}
		}
		if(circ != null) {
			return circ;
		}
		//If we get here, then we need to create a new circulator.
		Node next = getNext(start,stop,dir);
		while(next != null) {
			if(predicate.test(next)) {
				circ = new OuterFaceCirculator(start,next,dir);
				outerFaceCirculators.add(circ);
				return circ;
			}
			next = getNext(next,stop,dir);
		}
		return null;
	}
}