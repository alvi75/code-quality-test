import java.util.*;

public class Translation658 {
    1 public ShapeFieldCacheDistanceValueSource(SpatialContext ctx, ShapeFieldCacheProvider<IPoint> provider, IPoint from, double multiplier) {
    2 super(ctx);
    3 this.ctx = ctx;
    4 this.from = from;
    5 this.provider = provider;
    6 this.multiplier = multiplier;
}
}