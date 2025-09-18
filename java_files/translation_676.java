import java.util.*;

public class Translation676 {
    public void addShape(HSSFShape shape) {
    shape.setPatriarch(this.getPatriarch());
    shape.setParent(this);
    shapes.add(shape);
}
}