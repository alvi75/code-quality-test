import java.util.*;

public class Generated_636767511a6d9265ec017eb6 {
    private OuterFaceCirculator selectOnOuterFace(Predicate<Node> predicate,Node start,Node stop,int dir){
		OuterFaceCirculator circ = new OuterFaceCirculator(start);
		while(circ.next()){
			if(predicate.test(circ.node())){
				if(circ.node() == stop) return circ;
				if(dir > 0 && circ.node().isLeftOf(stop)) return circ;
				if(dir < 0 && circ.node().isRightOf(stop)) return circ;
			}
		}
		return null;
	}
}