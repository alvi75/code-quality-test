import java.util.*;

public class Translationtranslation_658 {
    public ShapeFieldCacheDistanceValueSource(SpatialContext ctx,ShapeFieldCacheProvider<Shape> provider, Shape from, double multiplier) {
        this.ctx = ctx;
        this.from = from;
        this.provider = provider;
        this.multiplier = multiplier;
        this.nullValue = 180 * multiplier;
    }
}