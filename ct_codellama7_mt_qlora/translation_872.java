import java.util.*;

public class Translation872 {
    public Status(IndexDiff diff) {
    super();
    this.diff = diff;
    clean = diff.getAdded().isEmpty() && diff.getChanged().isEmpty() && diff.getRemoved().isEmpty() && diff.getMissing().isEmpty() && diff.getModified().isEmpty() && diff.getUntracked().isEmpty() && diff.getConflicting().isEmpty();
}
}