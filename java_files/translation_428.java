import java.util.*;

public class Translation428 {
    public synchronized SpatialStrategy getSpatialStrategy(int roundNumber) {
    SpatialStrategy result = spatialStrategyCache.get(roundNumber);
    if (result == null) {
        throw new IllegalStateException("Strategy should have been init'ed by SpatialDocMaker by now");
    }
    return result;
}
}