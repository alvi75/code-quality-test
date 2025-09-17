import java.util.*;

public class Translationtranslation_408 {
    public static double calcDistanceFromErrPct(Shape shape, double distErrPct, SpatialArgs args) {
        if (distErrPct < 0 || distErrPct > 0.5) {
            throw new IllegalArgumentException("distErrPct should be in [0, 0.5] range, got "+ distErrPct);
        }
        if (distErrPct == 0) {
            return 0;
        }
        Rectangle bbox = shape.getBoundingBox();
        double diagonalDist = ctx.getDistCalc().distance(ctx.getSrcPtg(), bbox.getMinX(), bbox.getMinY(), bbox.getMaxX(), bbox.getMaxY());
        return diagonalDist * distErrPct;
    }
}