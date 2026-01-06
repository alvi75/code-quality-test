import java.util.*;

public class Generated_636767511a6d9265ec017eb6 {
    private OuterFaceCirculator selectOnOuterFace(Predicate<Node> predicate,Node start,Node stop,int dir){
		OuterFaceCirculator circ=null;
		Node n=start;
		do{
			if(predicate.test(n)){
				circ=new OuterFaceCirculator(this,n);
				break;
			}
			n=n.next(dir);
		}while(n!=start);
		return circ;
	}
}