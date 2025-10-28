import java.util.*;

public class Generated_636767521a6d9265ec017ecc {
    public static Pair<Box2D,Box2D> splitAlongXAxis(Box2D box) {
        Box2D left = new Box2D(box);
        Box2D right = new Box2D(box);

        left.setMinX(box.getMinX());
        left.setMaxX(box.getMaxX());

        right.setMinX(box.getMaxX());
        right.setMaxX(box.getMaxX());

        return Pair.of(left,right);
    }
}