import java.util.*;

public class Generated_636767511a6d9265ec017eb6 {
    private OuterFaceCirculator selectOnOuterFace(Predicate<Node> predicate,Node start,Node stop,int dir){
		if(start==stop) return null;
		//find the outer face of the start node
		Node n = start;
		while(n!=null && !predicate.test(n)){
			n = n.getOut();
		}
		if(n==null) return null;
		//find the outer face of the stop node
		n = stop;
		while(n!=null && !predicate.test(n)){
			n = n.getIn();
		}
		if(n==null) return null;
		return new OuterFaceCirculator(n,n);
	}
}