import java.util.*;

public class Translation658 {
    ublic ShapeFieldCacheDistanceValueSource(SpatialContext ctx,ShapeFieldCacheProvider<Point> provider, Point from, double multiplier) {
    this.ctx = ctx;
    this.from = from;
    this.provider = provider;
    this.multiplier = multiplier;
    this.nullValue = 180 * multiplier;
}
}