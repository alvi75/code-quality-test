import java.util.*;

public class Translation408 {
    public static double calcDistanceFromErrPct(Shape shape, double distErrPct, SpatialReference sr) {
    if (distErrPct < 0 || distErrPct > 0.5) {
        throw new IllegalArgumentException("distErrPct " + distErrPct+ " must be between [0 to 0.5]");
    }
    if (distErrPct == 0 || shape instanceof Point) {
        return 0;
    }
    Rectangle2D bbox = shape.getBoundingBox();
    Point2D ctr = bbox.center();
    double y = (ctr.getY() >= 0 ? bbox.getMaxY() : bbox.getMinY());
    double diagonalDist = GeometryEngine.distance(ctr, bbox.getMaxX(), y, sr);
    return diagonalDist * distErrPct;
}
}