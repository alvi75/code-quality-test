import java.util.*;

public class Generated_636767511a6d9265ec017eb6 {
    public OuterFaceCirculator selectOnOuterFace(Predicate<Node> predicate,Node start,Node stop,int dir) {
        OuterFaceCirculator circulator = new OuterFaceCirculator(this,start,stop,dir);
        while(circulator.hasNext()){
            Node n = circulator.next();
            if(predicate.test(n))
                return circulator;
        }
        return null;
    }
}