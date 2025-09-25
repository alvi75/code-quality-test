import java.util.*;

public class Translation885 {
    public final RevCommit tryFastForward(RevCommit newHead) {
    final Ref head = repo.findRef(Constants.HEAD);
    if (head == null || head.getObjectId() == null)throw new RefNotFoundException(MessageFormat.format(JGitText.get().refNotResolved, Constants.HEAD));
    ObjectId expectedHeadId = head.getObjectId();
    if (expectedHeadId == null)throw new RefNotFoundException(MessageFormat.format(JGitText.get().refNotResolved, Constants.HEAD));
    final RevCommit headCommit = walk.parseCommit(expectedHeadId);
    if (isMergedInto(headCommit, newHead))return newHead;
    String headName;
    if (head.isSymbolic())headName = head.getTarget().getName();
    elsereturn tryFastForward(headName, headCommit, newHead);
}
}