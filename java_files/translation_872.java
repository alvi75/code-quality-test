import java.util.*;

public class Translationtranslation_872 {
    public Status(IndexDiff diff) {
        super(diff);
        this.clean = diff.getAdded().isEmpty()&& diff.getChanged().isEmpty()&& diff.getRemoved().isEmpty()&& diff.getMissing().isEmpty()&& diff.getModified().isEmpty()&& diff.getUntracked().isEmpty()&& diff.getConflicting().isEmpty();
    }
}