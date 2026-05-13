import java.util.*;

public class Translation408 {
    public static double calcDistanceFromErrPct(Shape shape, double distErrPct) {
    if (distErrPct < 0 || distErrPct > 0.5)throw new IllegalArgumentException("distErrPct "+ distErrPct +" must be between [0 to 0.5]");
    if (distErrPct == 0)return 0;
    if (shape instanceof Point)return 0;
    Rectangle bounds = shape.getBounds();
    double x = (bounds.x < 0 ? bounds.x+bounds.width : bounds.x);
    double y = (bounds.y < 0 ? bounds.y+bounds.height : bounds.y);
    double diagonalDist = DistanceUtils.distHaversine(x, y, x+bounds.width, y+bounds.height);
    return diagonalDist*distErrPct;
}
}