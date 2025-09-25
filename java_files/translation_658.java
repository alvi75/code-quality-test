import java.util.*;

public class Translation658 {
    public ShapeFieldCacheDistanceValueSource(SpatialContext ctx,ShapeFieldCacheProvider<org.locationtech.jts.geom.Point> provider, org.locationtech.jts.geom.Point from, double multiplier) {
    this.ctx = ctx;
    this.from = from;
    this.provider = provider;
    this.multiplier = multiplier;
}
}