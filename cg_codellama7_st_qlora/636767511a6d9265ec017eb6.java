import java.util.*;

public class Generated_636767511a6d9265ec017eb6 {
    private OuterFaceCirculator selectOnOuterFace(Predicate<Node> predicate,Node start,Node stop,int dir){
		OuterFaceCirculator circulator = new OuterFaceCirculator(start,stop,dir);
		while(circulator.hasNext()){
			Node node = circulator.next();
			if(predicate.test(node)) return circulator;
		}
		return null;
	}
}