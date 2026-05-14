import java.util.*;

public class Translation428 {
    1 public static SpatialStrategy getSpatialStrategy(int roundNumber) {
    2 final SpatialStrategy result;
    3 if ( ! spatialStrategyCache.containsKey( roundNumber ) ) {
        4 throw new IllegalStateException("Strategy should have been init'ed by SpatialDocMaker by now");
        5 }
        6 return spatialStrategyCache.get( roundNumber );
        7 }
}