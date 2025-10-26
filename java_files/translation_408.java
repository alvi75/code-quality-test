import java.util.*;

public class Translation408 {
    public static double calcDistanceFromErrPct(IShape shape , double distErrPct , SpatialContext ctx ) {
    if ( distErrPct < 0 || distErrPct > 0.5 ) {
        throw new IllegalArgumentException ( "distErrPct " + distErrPct + " must be between [0 to 0.5]" ) ;
    }
    if ( distErrPct == 0 || shape instanceof IPoint ) {
        return 0 ;
    }
    IRectangle bbox = shape . getBoundingBox ( ) ;
    IPoint ctr = bbox . center ;
    double y = ( ctr . getY ( ) >= 0 ? bbox . getMaxY ( ) : bbox . getMinY ( ) ) ;
    double diagonalDist = ctx . getDistanceCalculator ( ) . distance ( ctr , bbox . getMaxX ( ) , y ) ;
    return diagonalDist * distErrPct ;
}
}