import java.util.*;

public class Generated_6367674b1a6d9265ec017dc0 {
    private Set<V> initVisibleVertices(){
		Set<V> visible = new HashSet<>();
		for (E e : edges())
			if(e instanceof Edge){
				V v1 = ((Edge)e).getVertex(0);
				v1 = v1 == null ? v1 : v1;
				V v2 = ((Edge)e).getVertex(1);
				v2 = v2 == null ? v2 : v2;
				visible.add(v1);
				visible.add(v2);
			}
		return visible;
	}
}