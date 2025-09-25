import java.util.*;

public class Translation408 {
    public static double calcDistanceFromErrPct(Shape shape, double distErrPct, SpatialContext ctx) {
    if (distErrPct < 0 || distErrPct > 0.5) {
        throw new IllegalArgumentException("distErrPct " + distErrPct + " must be between [0 to 0.5]", "distErrPct");
    }
    if (shape instanceof IPoint) {
        return 0;
    }
    IRectangle bbox = ((IRange)shape).getBoundingBox();
    IPoint ctr = bbox.getCenter();
    double y = (ctr.getY() >= 0 ? bbox.getMaxY() : bbox.getMinY());
    double diagonalDist = ctx.getDistanceCalc().distance(ctr, bbox.getMaxX(), y);
    return diagonalDist * distErrPct;
}
}