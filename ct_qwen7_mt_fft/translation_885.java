import java.util.*;

public class Translation885 {
    public RevCommit tryFastForward(RevCommit newCommit) throws MissingObjectException,IncorrectObjectTypeException,IOException {
    final Ref head = repo.exactRef(Constants.HEAD);
    if (head == null)throw new IncorrectObjectTypeException(MessageFormat.format(JGitText.get().refNotResolved,Constants.HEAD));
    final ObjectId headId = head.getObjectId();
    if (headId == null)throw new IncorrectObjectTypeException(MessageFormat.format(JGitText.get().refNotResolved,Constants.HEAD));
    final RevCommit headCommit = walk.parseCommit(headId);
    if (!walk.isMergedInto(newCommit, headCommit))return null;
    String headName;
    if (head.isSymbolic())headName = head.getTarget().getName();
    elsetheadName = "detached HEAD";
    return tryFastForward(headName,newCommit);
}
}