import java.util.*;

public class Generated_636767521a6d9265ec017ecc {
    /**Divide a box into two equal boxes on the x axis.**/
	public static Pair<Box2D,Box2D> splitAlongXAxis(Box2D box){
		float halfWidth = (box.max.x - box.min.x) / 2;
		return new Pair<>(new Box2D(box.min.x, box.min.y, box.min.z, box.min.w + halfWidth),
				new Box2D(box.min.x + halfWidth, box.min.y, box.min.z, box.max.w));
	}
}