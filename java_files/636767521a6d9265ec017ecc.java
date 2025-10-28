import java.util.*;

public class Generated_636767521a6d9265ec017ecc {
    /**
     * Divide a box into two equal boxes on the x axis.
     */
    public static Pair<Box2D,Box2D> splitAlongXAxis(Box2D box) {
        double mid = (box.getMinX() + box.getMaxX()) / 2;
        return new Pair<>(new Box2D(box.getMinX(),mid,box.getMinY(),box.getMaxY()),
                          new Box2D(mid,box.getMaxX(),box.getMinY(),box.getMaxY()));
    }
}