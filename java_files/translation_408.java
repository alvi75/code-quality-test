import java.util.*;

public class Translation408 {
    public static double calcDistanceFromErrPct(Shape shape, double distErrPct, SpatialContext ctx) {
    if (distErrPct < 0 || distErrPct > 0.5) {
        throw new IllegalArgumentException("distErrPct " + distErrPct + " must be between [0 to 0.5]", "distErrPct");
    }
    if (shape instanceof Rectangle) {
        Rectangle bbox = (Rectangle) shape;
        double width = bbox.getWidth();
        double height = bbox.getHeight();
        double diagonalDist = ctx.getDistCalc().distance(bbox.getMinX(), bbox.getMaxX(), bbox.getMinY(), bbox.getMaxY());
        return diagonalDist * distErrPct;
    }
    else if (shape instanceof Circle) {
        Circle circle = (Circle) shape;
        double distErr = calcDistanceFromErrPct(circle.getCenter(), distErrPct, ctx);
        return distErr;
    }
    else {
        throw new UnsupportedOperationException("Only Rectangles and Circles are currently supported, " +"found [" + shape.getClass() + "]");
    }
}
}