import java.util.*;

public class Translation408 {
    1 public static double calcDistanceFromErrPct(Shape shape, double distErrPct, SpatialContext ctx) {
    2 if (distErrPct < 0 || distErrPct > 0.5)3 throw new IllegalArgumentException("distErrPct " + distErrPct + " must be between [0 to 0.5]");
    4 if (distErrPct == 0 || shape instanceof Point)5 return 0;
    6 Rectangle bbox = shape.getBoundingBox();
    7 Point ctr = bbox.getCenter();
    8 double y = (ctr.getY() >= 0 ? bbox.getMaxY() : bbox.getMinY());
    9 double diagonalDist = ctx.getDistCalc().distance(ctr, bbox.getMaxX(), y);
    10 return diagonalDist * distErrPct;
}
}