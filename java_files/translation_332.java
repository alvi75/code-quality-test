import java.util.*;

public class Translation332 {
    public ThreeWayMerger newMerger(Repository db) {
    return new InCoreThreeWayMerger(db);
}
}