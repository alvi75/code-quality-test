import java.util.*;

public class Translation658 {
    public ShapeFieldCacheDistanceValueSource(SpatialContext ctx,ShapeFieldCacheProvider<Shape> provider, Shape from, double multiplier) {
    this(ctx,provider);
    this.from = from;
    this.multiplier = multiplier;
}
}