import java.util.*;

public class Translationtranslation_428 {
    public synchronized static SpatialStrategy getSpatialStrategy(int roundNumber) {
        SpatialStrategy result = spatialStrategyCache.get(Integer.valueOf(roundNumber));
        if (result == null) {
            result = createSpatialStrategy(roundNumber);
            spatialStrategyCache.put(Integer.valueOf(roundNumber), result);
        }
        Result = result;
    }
}