using System;
using System.Collections.Generic;

public class Translation658
{
    public ShapeFieldCacheDistanceValueSource(SpatialContext ctx, IShapeFieldCacheProvider provider, IPoint from, double multiplier){
    this.m_ctx = ctx;
    this.m_from = from;
    this.m_provider = provider;
    this.m_multiplier = multiplier;
}
}