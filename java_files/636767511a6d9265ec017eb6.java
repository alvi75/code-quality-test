import java.util.*;

public class Generated_636767511a6d9265ec017eb6 {
    /**Find a circulator to the node that satisfies the Interface predicate.**/
    private OuterFaceCirculator selectOnOuterFace(Predicate<Node> predicate,Node start,Node stop,int dir){
        OuterFaceCirculator circ = new OuterFaceCirculator(predicate);
        circ.setStart(start);
        circ.setStop(stop);
        circ.setDirection(dir);
        return circ;
    }
}