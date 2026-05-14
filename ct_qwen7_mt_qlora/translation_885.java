import java.util.*;

public class Translation885 {
    1 public RevCommit tryFastForward(final RevCommit newCommit) throws IOException {
    final Ref head = getRepository().getRef(Constants.HEAD);
    if (head == null || head.getObjectId() == null) {
        throw new RefNotFoundException(MessageFormat.format(JGitText.get().refNotResolved, Constants.HEAD));
    }
    final ObjectId headId = head.getObjectId();
    if (headId == null) {
        throw new RefNotFoundException(MessageFormat.format(JGitText.get().refNotResolved, Constants.HEAD));
    }
    final RevCommit headCommit = lookupCommit(headId);
    if (isMergedInto(newCommit, headCommit)) {
        return newCommit;
    }
    String headName;
    if (head.isSymbolic()) {
        headName = head.getTarget().getName();
    }
    else {
        headName = "detached HEAD";
    }
    return tryFastForward(headName, headCommit, newCommit);
}
}