import java.util.*;

public class Generated_636767511a6d9265ec017eb6 {
    private OuterFaceCirculator selectOnOuterFace(Predicate<Node> predicate,Node start,Node stop,int dir){
		if (start == null || stop == null)
			return null;
		if (dir == 0) {
			for (Node n = start; n != null; n = n.next) {
				if (predicate.test(n)) {
					return new OuterFaceCirculator(n);
				}
			}
		} else if (dir == 1) {
			for (Node n = start; n != null; n = n.next) {
				if (n.prev == null && !predicate.test(n)) {
					return new OuterFaceCirculator(n);
				}
			}
		} else {
			for (Node n = start; n != null; n = n.next) {
				if (n.prev == null && !predicate.test(n)) {
					return new OuterFaceCirculator(n);
				}
			}
		}
		return null;
	}
}