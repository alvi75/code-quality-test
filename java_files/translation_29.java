import java.util.*;

public class Translation29 {
    ublic Polygon createPolygon(ChildAnchor anchor) {
    Polygon shape = new Polygon(this, anchor);
    shape.setParent(this);
    shape.setAnchor(anchor);
    shapes.add(shape);
    onCreate(shape);
    return shape;
}
}