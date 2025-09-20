import java.util.*;

public class Translation676 {
    public void addShape(HSSFPolygon shape) {
    shape.setPatriarch(getPatriarch());
    shape.setParent(this);
    getShapes().add(shape);
}
}