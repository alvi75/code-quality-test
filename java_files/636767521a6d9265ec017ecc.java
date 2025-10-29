import java.util.*;

public class Generated_636767521a6d9265ec017ecc {
    /**Divide a box into two equal boxes on the x axis.*/
    public static Pair<Box2D,Box2D> splitAlongXAxis(Box2D box){
        Box2D b1 = new Box2D(box);
        Box2D b2 = new Box2D(box);
        double midx = (box.max.x + box.min.x) / 2;
        b1.max.x = midx;
        b2.min.x = midx;
        return new Pair<>(b1,b2);
    }
}