import java.util.*;

public class Translation428 {
    public synchronized static SpatialStrategy get(SpatialOperation operation, int maxLevels) {
    if (operation == null || maxLevels < 0) throw new NullPointerException("operation must not be null and maxLevels must be >= 0");
    if (maxLevels > MAX_MAX_LEVELS)throw new IllegalArgumentException("Max level count must be <= " +MAX_MAX_LEVELS);
    final Class<? extends Shape> shapeClass = shapeCache.get(operation);
    if (shapeClass == null) {
        shapeClass = resolveShape(Shape.class, operation);
    }
    shapeCache.put(operation, shapeClass);
}
else if (shapeClass != Shape.class && shapeClass != Point.class) {
    throw new IllegalArgumentException("Invalid shape type for operation " + operation);
}
List<Shape> shapes = new ArrayList<>();
try (ShapeBuilder builder = new ShapeBuilder(shapeClass)) {
    shapes.add(builder.createShape(point));
    for (int i = 1;
    i < maxLevels+1;
    i++) {
        shapes.addAll(createLevelShapes(i, shapeClass));
    }
}
}