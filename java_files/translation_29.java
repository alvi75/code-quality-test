import java.util.*;

public class Translation29 {
    public HSSFPolygon createPolygon(HSSFChildAnchor anchor) {
    HSSFPolygon shape = new HSSFPolygon(null, anchor);
    shape.setParent(this);
    shape.setAnchor(anchor);
    shapes.add(shape);
    onCreate(shape);
    return shape;
}
}