import java.util.*;

public class Generated_636767521a6d9265ec017ecc {
    /**Divide a box into two equal boxes on the x axis.*/
	public static Pair<Box2D,Box2D> splitAlongXAxis(Box2D box){
		double mid = (box.xmin + box.xmax) / 2;
		return new Pair<Box2D,Box2D>(new Box2D(box.xmin, mid, box.ymin, box.ymax), new Box2D(mid, box.xmax, box.ymin, box.ymax));
	}
}