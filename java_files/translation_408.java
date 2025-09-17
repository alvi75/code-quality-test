import java.util.*;

public class Translationtranslation_408 {
    public static double calcDistanceFromErrPct(IShape shape, double distErrPct, SpatialContext ctx) {
        if (distErrPct < 0 || distErrPct > 0.5) {
            throw new IllegalArgumentException("distErrPct " + distErrPct + " must be between [0 to 0.5]");
        }
        if (distErrPct == 0 || shape instanceof Point) {
            return 0;
        }
        Rectangle bbox = shape.getBoundingBox();
        int x = bbox.getMinX();
        int y = bbox.getMinY();
        int w = bbox.getWidth();
        int h = bbox.getHeight();
        double diagonalDist = ctx.getDistCalc().distance(x,y,x+w,y+h);
        return diagonalDist * distErrPct;
    }
}