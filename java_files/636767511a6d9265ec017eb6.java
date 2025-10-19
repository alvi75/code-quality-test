import java.util.*;

public class Generated_636767511a6d9265ec017eb6 {
    private OuterFaceCirculator selectOnOuterFace(Predicate<Node> predicate,Node start,Node stop,int dir){
		if(start==null)start=outer;
		if(stop==null)stop=outer;
		if(dir==0)dir=1;
		if(dir==-1)dir=-1;

		//System.out.println("selectOnOuterFace: "+predicate+" "+start+" "+stop);
		//System.out.println("selectOnOuterFace: "+(predicate==null?0:1));
		boolean found=false;
		for (int i = 0; i < outer.size(); i++) {
			Node n=outer.get(i);

			if(n==start||n==stop)
				continue;
			if(predicate.apply(n))
				return new OuterFaceCirculator(this,n,dir);
			else if(!found && n!=start && n!=stop)
				found=true;
		}
		return null;
	}
}