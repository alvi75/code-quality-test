import java.util.*;

public class Translation408 {
    ublic static double calcDistanceFromErrPct(Shape shape, double distErrPct, SpatialContext ctx) {
    if (distErrPct < 0 || distErrPct > 0.5) {
        throw new IllegalArgumentException("distErrPct " + distErrPct + " must be between [0 to 0.5]", "distErrPct");
    }
    if (distErrPct == 0 || shape instanceof Point) {
        return 0;
    }
    Rectangle bbox = shape.getBoundingBox();
    Point ctr = bbox.center();
    double y = (ctr.y >= 0 ? bbox.getMaxY() : bbox.getMinY());
    double diagonalDist = ctx.distCalc.distance(ctr, bbox.getMaxX(), y);
    return diagonalDist * distErrPct;
}
}