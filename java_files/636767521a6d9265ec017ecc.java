import java.util.*;

public class Generated_636767521a6d9265ec017ecc {
    public static Pair<Box2D,Box2D> splitAlongXAxis(Box2D box){
		double mid = (box.x1 + box.x2) / 2;
		return new Pair<Box2D,Box2D>(new Box2D(box.x1, mid, box.y1, box.y2), new Box2D(mid, box.x2, box.y1, box.y2));
	}
}