ublic ShapeFieldCacheDistanceValueSource(SpatialContext ctx,ShapeFieldCacheProvider<IPoint> provider, Point from, double multiplier) {
    this.ctx = ctx;
    this.from = from;
    this.provider = provider;
    this.multiplier = multiplier;
}