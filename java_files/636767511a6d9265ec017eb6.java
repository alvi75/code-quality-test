import java.util.*;

public class Generated_636767511a6d9265ec017eb6 {
    private OuterFaceCirculator selectOnOuterFace(Predicate<Node> predicate,Node start,Node stop,int dir){
		OuterFaceCirculator circ = null;
		if(dir==1){
			circ = new OuterFaceCirculator(start);
		}else{
			circ = new OuterFaceCirculator(stop);
		}
		while(circ.hasNext()){
			Node n = circ.next();
			if(predicate.test(n)){
				return circ;
			}
		}
		return null;
	}
}