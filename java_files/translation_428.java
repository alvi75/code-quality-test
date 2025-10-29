import java.util.*;

public class Translation428 {
    01 public static SpatialStrategy getSpatialStrategy(int roundNumber) {
    SpatialStrategy result;
    if (!spatialStrategyCache.containsKey(roundNumber)) {
        throw new IllegalStateException("Strategy should have been init'ed by SpatialDocMaker by now");
    }
    result = spatialStrategyCache.get(roundNumber);
    return result;
}
}