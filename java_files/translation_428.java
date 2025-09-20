import java.util.*;

public class Translation428 {
    public static SpatialStrategy getSpatialStrategy(int roundNumber) {
    if (roundNumber < 0 || roundNumber >= _roundNumbers.length) {
        throw new IllegalArgumentException("round number " + roundNumber + " not in range 0.." + (_roundNumbers.length - 1));
    }
    return _roundNumbers[roundNumber];
}
}