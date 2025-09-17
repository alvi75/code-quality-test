import java.util.*;

public class Translationtranslation_29 {
    public HSSFPolygon createPolygon(HSSFChildAnchor anchor) {
        HSSFPolygon shape = new HSSFPolygon(null, anchor);
        addShape(shape);
        onCreate(shape);
        return shape;
    }
}