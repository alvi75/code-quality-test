import java.util.*;

public class Translation872 {
    public Status(IndexDiff diff) {
    super();
    this.diff = diff;
    clean = diff.added.isEmpty()&&diff.changed.isEmpty()&&diff.removed.isEmpty()&&diff.missing.isEmpty()&&diff.modified.isEmpty()&&diff.untracked.isEmpty();
}
}