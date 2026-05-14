import java.util.*;

public class Generated_636767511a6d9265ec017eb6 {
    /**Find a circulator to the node that satisfies the Interface predicate.**/
    private OuterFaceCirculator selectOnOuterFace(Predicate<Node> predicate,Node start,Node stop,int dir){
        if (start == null) {
            return null;
        }
        Node current = start;
        do {
            if (predicate.test(current)) {
                return new OuterFaceCirculator(current,stop,dir);
            }
            current = next(current,dir);
        } while (current != start);
        return null;
    }
}