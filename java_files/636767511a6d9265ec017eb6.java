import java.util.*;

public class Generated_636767511a6d9265ec017eb6 {
    /**Find a circulator to the node that satisfies the Interface predicate.
 * @param predicate The predicate to test against each node in the circulator.
 * @param start The starting point of the search.
 * @param stop The end point of the search.
 * @param dir The direction of the search.
 * @return A circulator to the first node that satisfies the predicate or null if no such node exists.
 */
private OuterFaceCirculator selectOnOuterFace(Predicate<Node> predicate,
                                                Node start,
                                                Node stop,
                                                int dir){
        return new OuterFaceCirculator(start,stop,predicate,dir);
    }
}