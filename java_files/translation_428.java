import java.util.*;

public class Translation428 {
    public static SpatialStrategy getSpatialStrategy(int roundNumber) {
    SpatialStrategy result = spatialStrategies.get(Integer.valueOf(roundNumber));
    if (result != null) {
        return result;
    }
    else {
        throw new RuntimeException("Round number [" + roundNumber+ "] is out of range [1," + spatialStrategies.size() + "]");
    }
}
}