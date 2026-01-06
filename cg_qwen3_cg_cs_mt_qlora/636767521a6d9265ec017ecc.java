import java.util.*;

public class Generated_636767521a6d9265ec017ecc {
    public static Pair<Box2D,Box2D> splitAlongXAxis(Box2D box){
        double mid = (box.max.x + box.min.x) / 2;
        return new Pair<>(new Box2D(box.min.x, mid, box.min.y, box.max.y), new Box2D(mid, box.max.x, box.min.y, box.max.y));
    }
}