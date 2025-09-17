import java.util.*;

public class Translationtranslation_658 {
    public ShapeFieldCacheDistanceValueSource(SpatialContext ctx,ShapeFieldCacheProvider<IPoint> provider, Point from, double multiplier) {
        super(ctx, from, getShape());
        this.provider = provider;
        this.multiplier = multiplier;
    }
}