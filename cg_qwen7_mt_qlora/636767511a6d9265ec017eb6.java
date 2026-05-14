import java.util.*;

public class Generated_636767511a6d9265ec017eb6 {
    private OuterFaceCirculator selectOnOuterFace(Predicate<Node> predicate,Node start,Node stop,int dir){
		if(start==null||stop==null)
			return null;
		
		Node n=start;
		do{
			if(predicate.test(n))
				return new OuterFaceCirculator(this,n);
			
			n=n.getOtherEnd().getOpposite();
		}while(n!=stop&&n!=start);
		
		return null;
	}
}