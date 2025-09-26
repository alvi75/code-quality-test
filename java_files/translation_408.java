import java.util.*;

public class Translation408 {
    12 public static double calcDistanceFromErrPct(Shape shape, double distErrPct, SpatialContext ctx) {
    if (distErrPct < 0 || distErrPct > 0.5) {
        throw new IllegalArgumentException("distErrPct " + distErrPct + " must be between [0 to 0.5]", "distErrPct");
    }
    if (distErrPct == 0 || shape instanceof Point) {
        return 0;
    }
    Rectangle2D bbox = shape.getEnvelopeInternal();
    Point2D ctr = bbox.getCenter();
    double y = (ctr.getY() >= 0 ? bbox.getMaxY() : bbox.getMinY());
    double diagonalDist = ctx.getDistanceCalculator().distance(ctr, bbox.getMaxX(), y);
    return diagonalDist * distErrPct;
}
}