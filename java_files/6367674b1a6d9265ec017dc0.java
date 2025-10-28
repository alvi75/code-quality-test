import java.util.*;

public class Generated_6367674b1a6d9265ec017dc0 {
    private Set<V> initVisibleVertices(){
        Set<V> visible = new HashSet<>();
        for (E e : edgeSet()) {
            V v1 = getV(e);
            V v2 = getOpposite(v1, e);
            if (!visible.contains(v1)) { visible.add(v1); }
            if (!visible.contains(v2)) { visible.add(v2); }
        }
        return visible;
    }
}