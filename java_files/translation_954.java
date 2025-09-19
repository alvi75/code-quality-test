import java.util.*;

public class Translation954 {
    public ThreeWayMerger newMerger(Repository db) {
    return new ResolveMerger(db);
}
}