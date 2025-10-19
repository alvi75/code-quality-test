import java.util.*;

public class Generated_636767511a6d9265ec017eb6 {
    private OuterFaceCirculator selectOnOuterFace(Predicate<Node> predicate,Node start,Node stop,int dir){
		//We have to check for the case where we're looking in the wrong direction.
		if(dir < 0){
			start = start.getPrev();
			stop = stop.getNext();
			dir = -dir;
		}
		
		//We also need to make sure that we don't loop infinitely if there is no solution.
		Node curr = start;
		while(curr != stop && curr != null){
			OuterFaceCirculator circ = new OuterFaceCirculator(curr);
			if(predicate.test(circ.curr)){
				return circ;
			}
			curr = curr.getNext(dir);
		}
		return null;
	}
}