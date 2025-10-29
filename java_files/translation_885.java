import java.util.*;

public class Translation885 {
    01 public RevCommit tryFastForward(RevCommit newCommit) throws RefNotFoundException {
    Ref head = repo.getRef(Constants.HEAD);
    if (head == null || head.getObjectId() == null) {
        throw new RefNotFoundException(MessageFormat.format(JGitText.get().refNotResolved, Constants.HEAD));
    }
    ObjectId headId = head.getObjectId();
    if (headId == null) {
        throw new RefNotFoundException(MessageFormat.format(JGitText.get().refNotResolved, Constants.HEAD));
    }
    RevCommit headCommit = walk.lookupCommit(headId);
    if (walk.isMergedInto(newCommit, headCommit)) {
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