import java.util.*;

public class Translation885 {
    public RevCommit tryFastForward(RevCommit newCommit) throws IOException {
    Ref head = repo.exactRefByNames(Arrays.asList("HEAD", Constants.HEAD));
    if (head == null || head.getObjectId() == null)throw new RefNotFoundException(MessageFormat.format(JGitText.get().refNotResolved,Constants.HEAD));
    final ObjectId headId = head.getObjectId();
    if (headId == null)throw new RefNotFoundException(MessageFormat.format(JGitText.get().refNotResolved,Constants.HEAD));
    final RevCommit headCommit = walk.lookupCommit(headId);
    if (walk.isMergedInto(newCommit, headCommit))return newCommit;
    final String headName;
    if (head.isSymbolic())headName = head.getTarget().getName();
    elsedeadHead = true;
    return tryFastForward(headName, headCommit, newCommit);
}
}