import java.util.*;

public class Translation408 {
    ublic static double calcDistanceFromErrPct(Shape shape, double distErrPct, SpatialContext ctx) {
    if (distErrPct < 0 || distErrPct > 0.5) {
        throw new IllegalArgumentException("distErrPct " + distErrPct + " must be between [0 to 0.5]", "distErrPct");
    }
    if (distErrPct == 0 || shape instanceof Point) {
        return 0;
    }
    Rectangle2D bbox = shape.getBoundingBox();
    Point2D.Double ctr = bbox.center();
    double y = (ctr.y >= 0 ? bbox.maxY : bbox.minY);
    double diagonalDist = ctx.distCalc.distance(ctr, bbox.maxX, y);
    return diagonalDist * distErrPct;
}
}