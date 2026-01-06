import java.util.*;

public class Translation332 {
    ublic MergeStrategy newMerger(Repository db) {
    return new SimpleTwoWayInCore.Merger(db);
}
}