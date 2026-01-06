import java.util.*;

public class Generated_636767511a6d9265ec017eb6 {
    private OuterFaceCirculator selectOnOuterFace(Predicate<Node> predicate,Node start,Node stop,int dir){
        OuterFaceCirculator circulator = null;
        if (dir == 0) {
            circulator = new OuterFaceCirculator(start,stop,predicate);
        } else if (dir == 1) {
            circulator = new OuterFaceCirculator(stop,start,predicate);
        }
        return circulator;
    }
}