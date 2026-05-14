import java.util.*;

public class Translation29 {
    ublic HTPolygon createPolygon(HSSFChildAnchor anchor) {
    HTPolygon shape = new HTPolygon(this, anchor);
    shape.setParent(this);
    shape.setAnchor(anchor);
    shapes.add(shape);
    onCreate(shape);
    return shape;
}
}