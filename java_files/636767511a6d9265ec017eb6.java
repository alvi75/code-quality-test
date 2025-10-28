import java.util.*;

public class Generated_636767511a6d9265ec017eb6 {
    public OuterFaceCirculator selectOnOuterFace(Predicate<Node> predicate,Node start,Node stop,int dir){
		OuterFaceCirculator circulator = null;
		for(OuterFaceCirculator outer : outerFaces){
			if(outer.selectOn(start,predicate,dir)){
				circulator = outer;
				break;
			}
		}
		return circulator;
	}
}