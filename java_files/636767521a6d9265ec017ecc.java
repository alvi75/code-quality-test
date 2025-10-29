import java.util.*;

public class Generated_636767521a6d9265ec017ecc {
    /**Divide a box into two equal boxes on the x axis.**/
    public static Pair<Box2D,Box2D> splitAlongXAxis(Box2D box) {
        return new Pair<>(new Box2D(box.x, 0, box.x + box.width, box.height / 2),
                new Box2D(box.x + box.width, 0, box.x + box.width, box.height / 2));
    }
}