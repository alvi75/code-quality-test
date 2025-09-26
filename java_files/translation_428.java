import java.util.*;

public class Translation428 {
    1 public static SpatialStrategy getSpatialStrategy ( int roundNumber ) {
    SpatialStrategy result ;
    if ( ! spatialStrategyCache . containsKey ( roundNumber ) || ( result = spatialStrategyCache . get ( roundNumber ) ) == null ) {
        throw new IllegalStateException ( "Strategy should have been init'ed by SpatialDocMaker by now" ) ;
    }
    return result ;
}
}