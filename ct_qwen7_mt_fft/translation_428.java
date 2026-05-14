import java.util.*;

public class Translation428 {
    public static SpatialStrategy getSpatialStrategy(int roundNumber) {
    if (roundNumber < 0 || roundNumber >= spatialStrategies.length) {
        throw new IllegalArgumentException("Round " + roundNumber+ " is not a valid round number.");
    }
    return spatialStrategies[roundNumber];
}
}