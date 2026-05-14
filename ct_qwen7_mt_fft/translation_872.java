import java.util.*;

public class Translation872 {
    public Status(IndexDiff diff) {
    super();
    this.diff = diff;
    clean = diff.getAddedFiles().isEmpty()&& diff.getChangedFiles().isEmpty()&& diff.getRemovedFiles().isEmpty();
}
}