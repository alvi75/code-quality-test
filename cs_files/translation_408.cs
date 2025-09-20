using System;
using System.Collections.Generic;

public class Translation408
{
    public static double CalcDistanceFromErrPct(Shape shape, double distErrPct, SpatialContext ctx){
    if (distErrPct < 0 || distErrPct > 0.5){
        throw new ArgumentException("distErrPct " + distErrPct + " must be between [0 to 0.5]");
    }
    var bbox = shape.BoundingBox;
    var ctr = bbox.Center;
    double distErr = CalcDistance(ctr, bbox.MinX, bbox.MaxX, bbox.MinY, bbox.MaxY, distErrPct, ctx);
    return distErr;
}
}