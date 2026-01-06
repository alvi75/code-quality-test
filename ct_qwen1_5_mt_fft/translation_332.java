import java.util.*;

public class Translation332 {
    public MergeStrategy newMerger(Repository db) {
    return new SimpleTwoWayInCoreMerger(db);
}
}