import java.util.*;

public class Generated_636767511a6d9265ec017eb6 {
    private OuterFaceCirculator selectOnOuterFace(Predicate<Node> predicate,
                                                   Node start,Node stop,int dir) {
        if (start == null || stop == null)
            return null;
        OuterFaceCirculator circ = new OuterFaceCirculator(start);
        while (!circ.isDone()) {
            Node n = circ.next();
            if (predicate.apply(n)) {
                if (n == stop)
                    return circ;
                else
                    circ.resetToNext();
            }
        }
        return null;
    }
}