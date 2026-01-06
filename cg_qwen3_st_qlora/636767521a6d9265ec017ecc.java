import java.util.*;

public class Generated_636767521a6d9265ec017ecc {
    /**
 * Divide a box into two equal boxes on the x axis.
**/
public static Pair<Box2D,Box2D> splitAlongXAxis(Box2D box){
        double mid = (box.x1 + box.x0) / 2;
        return new Pair<>(new Box2D(box.x0, mid, box.y0, box.y1), new Box2D(mid, box.x1, box.y0, box.y1));
    }
}