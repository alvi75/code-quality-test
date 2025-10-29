import java.util.*;

public class Translation408 {
    ublic static double CalcDistanceFromErrPct(IShape shape, double distErrPct, SpatialContext ctx){
    if (distErrPct < 0 || distErrPct > 0.5){
        throw new IllegalArgumentException("distErrPct " + distErrPct + " must be between [0 to 0.5]", "distErrPct");
    }
    if (distErrPct == 0 || shape is IPoint){
        return 0;
    }
    IRectangle bbox = shape.BoundingBox;
    IPoint ctr = bbox.Center;
    double y = (ctr.Y >= 0 ? bbox.MaxY : bbox.MinY);
    double diagonalDist = ctx.DistCalc.Distance(ctr, bbox.MaxX, y);
    return diagonalDist * distErrPct;
}
}