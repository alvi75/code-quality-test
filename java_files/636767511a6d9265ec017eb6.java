import java.util.*;

public class Generated_636767511a6d9265ec017eb6 {
    private OuterFaceCirculator selectOnOuterFace(Predicate<Node> predicate,Node start,Node stop,int dir){
		if(start==null || stop==null) return null;
		//System.out.println("selectOnOuterFace: "+start+" - "+stop);
		OuterFaceCirculator circ = new OuterFaceCirculator();
		circ.start = start;
		circ.stop = stop;
		circ.dir = dir;
		circ.pred = predicate;
		return circ;
	}
}