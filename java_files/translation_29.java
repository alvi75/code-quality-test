import java.util.*;

public class Translation29 {
    01 public Polygon createPolygon(ChildAnchor anchor) {
    Polygon shape = new Polygon(this, anchor);
    shape.parent = this;
    shape.anchor = anchor;
    shapes.add(shape);
    onCreate(shape);
    return shape;
}
}