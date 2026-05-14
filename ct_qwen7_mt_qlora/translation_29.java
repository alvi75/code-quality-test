import java.util.*;

public class Translation29 {
    1 public HSSFPolygon createPolygon(HSSFChildAnchor anchor) {
    2 HSSFPolygon shape = new HSSFPolygon(this, anchor);
    3 shape.setParent(this);
    4 shape.setAnchor(anchor);
    5 shapes.add(shape);
    6 onCreate(shape);
    7 return shape;
}
}