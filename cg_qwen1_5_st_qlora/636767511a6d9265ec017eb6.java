import java.util.*;

public class Generated_636767511a6d9265ec017eb6 {
    /**Find a circulator to the node that satisfies the Interface predicate.*/
    private OuterFaceCirculator selectOnOuterFace(Predicate<Node> predicate,
            Node start,Node stop,int dir){
        if(start==stop) return null;
        int i=0;
        for(OuterFaceCirculator circ=circulators[i];circ!=null;circ=circ.next()){
            if(circ.isOnOuterFace()&&predicate.test(circ.node())){
                if(dir<0 && circ.node().equals(stop)) return circ;
                else if(dir>=0 && circ.node().equals(start)) return circ;
            }
        }
        return null;
    }
}