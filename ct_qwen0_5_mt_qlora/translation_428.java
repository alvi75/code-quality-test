import java.util.*;

public class Translation428 {
    public static SpatialStrategy getSpatialStrategy(int roundNumber) {
    if (spatialStrategyCache.containsKey(roundNumber)) {
        return spatialStrategyCache.get(roundNumber);
    }
    else {
        throw new IllegalStateException("Strategy should have been init'ed by SpatialDocMaker by now.");
    }
}
}