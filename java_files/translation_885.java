import java.util.*;

public class Translation885 {
    public RevCommit tryFastForward(RevCommit newCommit)throws IOException {
    final Ref head = repo.exactRef(HEAD);
    if (head == null || head.getObjectId() == null)throw new RefNotFoundException(MessageFormat.format(JGitText.get().refNotResolved,HEAD));
}
final ObjectId headId = head.getObjectId();
if (headId == null)throw new RefNotFoundException(MessageFormat.format(JGitText.get().refNotResolved,HEAD));
final RevCommit headCommit = walk.lookupCommit(headId);
if (walk.isMergedInto(newCommit, headCommit))return newCommit;
final String headName = head.getName();
final RevCommit refLogIdent = parseCommit(headId);
try (RevWalk walk = new RevWalk(repo)) {
    List<Ref> tags = new ArrayList<>();
    Ref tag = walk.findFirstTag();
    while (tag != null && tag.getName().equals(headName)) {
        tags.add(tag);
        tag = walk.next();
    }
    if (!tags.isEmpty()) {
        String message = JGitText.get().fastForwardUpdate;
        boolean ok = promptYesNo(message + "\n" + getRefName());
        if (ok || !tags.contains(refLogIdent)) {
            return newCommit;
        }
        setResult(Result.NO_CHANGE);
    }
    return updateRef(HEAD, newCommit);
}
}