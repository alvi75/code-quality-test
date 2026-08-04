import java.util.*;

public class Translation428 {
    public static SpatialStrategy getSpatialStrategy(int roundNumber) {
    SpatialStrategy result;
    if (!spatialStrategyCache.containsKey(roundNumber) || !spatialStrategyCache.get(roundNumber).isPresent()) {
        throw new IllegalStateException("Strategy should have been init'ed by SpatialDocMaker by now");
    }
    return spatialStrategyCache.get(roundNumber).get();
}
}