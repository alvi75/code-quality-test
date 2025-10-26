import java.util.*;

public class Translation428 {
    ublic static SpatialStrategy getSpatialStrategy(int roundNumber) {
    if (spatialStrategyCache.containsKey(roundNumber)) {
        return spatialStrategyCache.get(roundNumber);
    }
    throw new IllegalStateException("Strategy should have been init'ed by SpatialDocMaker by now");
}
}