import java.util.*;

public class Generated_636767521a6d9265ec017ecc {
    /**Divide a box into two equal boxes on the x axis.**/
    double mid = (box.getMin().x + box.getMax().x) / 2;
    return new Pair<>(new Box2D(box.getMin(), new Point2D(mid, box.getMax().y)), new Box2D(new Point2D(mid, box.getMin().y), box.getMax()));
}
}