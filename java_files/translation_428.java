import java.util.*;

public class Translation428 {
    public static SpatialStrategy getSpatialStrategy(int roundNumber) {
    SpatialStrategy result;
    if (!spatialStrategyCache.get(roundNumber, (result = null)) || result == null) {
        throw new IllegalStateException("Strategy should have been init'ed by SpatialDocMaker by now");
    }
    return result;
}
}