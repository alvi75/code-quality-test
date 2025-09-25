import java.util.*;

public class Translation408 {
    1) public static double calcDistanceFromErrPct(Shape shape, double distErrPct, SpatialReference sr) {
    if (shape instanceof Point)return 0;
    if (shape instanceof MultiPoint)return 0;
    if (shape instanceof Envelope) {
        Envelope env = (Envelope) shape;
        double xMax = env.getMaxX();
        double yMax = envMaxY(env);
        double xMin = env.getMinX();
        double yMin = envMinY(env);
    }
    else if (shape instanceof Polygon) {
        Polygon poly = (Polygon) shape;
        Envelope env = poly.getEnvelopeInternal();
        double xMax = env.getMaxX();
        double yMax = envMaxY(env);
        double xMin = env.getMinX();
        double yMin = envMinY(env);
    }
    else if (shape instanceof MultiPolygon) {
        MultiPolygon mp = (MultiPolygon) shape;
        Envelope[] envelopes = new Envelope[mp.getNumGeometries()];
        for (int i = 0;
        i < mp.getNumGeometries();
        i++) {
            envelopes[i] = mp.getGeometryN(i).getEnvelopeInternal();
        }
        double maxx = Double.MIN_VALUE;
        double minx = Double.MAX_VALUE;
        double maxy = Double.MIN_VALUE;
        double miny = Double.MAX_VALUE;
        for (Envelope env : envelopes) {
            maxx = Math.max(maxx, env.getMaxX());
            minx = Math.min(minx, env.getMinX());
            maxy = Math.max(maxy, env.getMaxY());
            miny = Math.min(miny, env.getMinY());
        }
        double diagonalDist = Math.sqrt((maxx - minx) * (maxx - minx) + (maxy - miny) * (maxy - miny));
        return diagonalDist * distErrPct;
    }
}