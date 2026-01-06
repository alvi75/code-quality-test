import java.util.*;

public class Generated_636767511a6d9265ec017eb6 {
    private OuterFaceCirculator selectOnOuterFace(Predicate<Node> predicate,Node start,Node stop,int dir){
		OuterFaceCirculator circ = null;
		for(OuterFaceCirculator c : outerFaceCirculators) {
			if(c.getStart() == start && c.getStop() == stop && c.getDirection() == dir) {
				circ = c;
				break;
			}
		}
		if(circ == null) {
			circ = new OuterFaceCirculator(start,stop,dir);
			outerFaceCirculators.add(circ);
		}
		return circ;
	}
}