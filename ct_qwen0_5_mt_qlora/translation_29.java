import java.util.*;

public class Translation29 {
    public HSSFPolygon createPolygon(HSSFChildAnchor anchor) {
    HSSFPolygon shape = new HSSFPolygon(this, anchor);
    shape.setParent(this);
    shapes.add(shape);
    onCreate(shape);
    return shape;
}
}