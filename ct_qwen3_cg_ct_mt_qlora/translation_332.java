import java.util.*;

public class Translation332 {
    public Merger newMerger(Repository db) {
    return new StrategySimpleTwoWayInCore.InCoreMerger(db);
}
}