import java.util.*;

public class Translation872 {
    1 public Status(IndexDiff diff) {
    2 super();
    3 this.diff = diff;
    4 clean = diff.getAdded().isEmpty()5 && diff.getChanged().isEmpty()6 && diff.getRemoved().isEmpty()7 && diff.getMissing().isEmpty()8 && diff.getModified().isEmpty()9 && diff.getUntracked().isEmpty()10 && diff.getConflicting().isEmpty();
}
}