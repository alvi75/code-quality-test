import java.util.*;

public class Translation408 {
    public static double calcDistanceFromErrPct(IShape shape,double distErrPct,SpatialContext ctx) {
    if (distErrPct<0||distErrPct>0.5) {
        throw new IllegalArgumentException("distErrPct "+distErrPct+" must be between [0 to 0.5]");
    }
    if (distErrPct==0||shape instanceof IPoint) {
        return 0;
    }
    Rectangle2D_F64 bbox = shape.getBoundingBox();
    Point2D_F64 ctr = new Point2D_F64(bbox.getMinX(),bbox.getMaxY());
    double y = (ctr.y>=0?bbox.maxY:bbox.minY);
    double diagonalDist = ctx.distance(ctr,bbox.maxX,y);
    return diagonalDist*distErrPct;
}
}