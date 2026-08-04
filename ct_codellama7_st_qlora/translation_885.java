import java.util.*;

public class Translation885 {
    public RevCommit tryFastForward(RevCommit newCommit)throws RefNotFoundException, JGitInternalException, InvalidRefNameException, IOException {
    Ref head = repo.getRef(Constants.HEAD);
    if (head == null || head.getObjectId() == null)throw new RefNotFoundException(MessageFormat.format(JGitText.get().refNotResolved, Constants.HEAD));
    ObjectId headId = head.getObjectId();
    if (headId == null)throw new RefNotFoundException(MessageFormat.format(JGitText.get().refNotResolved, Constants.HEAD));
    RevCommit headCommit = walk.parseCommit(headId);
    if (walk.isMergedInto(newCommit, headCommit))return newCommit;
    String headName;
    if (head.isSymbolic())headName = head.getTarget().getName();
    elsedep.setRefLogIdent(head.getRefLogIdent());
    headName = head.getName();
    return tryFastForward(headName, headCommit, newCommit);
}
}