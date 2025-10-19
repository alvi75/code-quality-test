import java.util.*;

public class Generated_636767521a6d9265ec017ecc {
    public static Pair<Box2D,Box2D> splitAlongXAxis(Box2D box) {
		double w = box.getWidth()/2;
		double x = box.getCenterX();
		
		return new Pair<>(box.sub(new Vector2d(x,w)),box.add(new Vector2d(x,-w)));
	}
}