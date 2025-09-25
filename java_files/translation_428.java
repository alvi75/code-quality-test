import java.util.*;

public class Translation428 {
    public static SpatialStrategy getSpatialStrategy(int roundNumber) {
    if (spatialStrategyCache.get(roundNumber) == null) {
        throw new IllegalStateException("Strategy should have been init'ed by SpatialDocMaker by now");
    }
    return spatialStrategyCache.get(roundNumber);
}
}