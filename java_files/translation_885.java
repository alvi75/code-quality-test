import java.util.*;

public class Translationtranslation_885 {
    public RevCommit tryFastForward(RevCommit newCommit) throws NoWorkTreeException,InvalidRefNameException, RefNotFoundException {
        if (newCommit == null)throw new IllegalArgumentException("newCommit must not be null");
        if (newCommit.getName().equals(HEAD))throw new InvalidRefNameException(HEAD, JGitText.get().cannotBeCombinedWithThisRef);
        if (isDetached()) {
            throw new InvalidRefNameException(HEAD, JGitText.get().cannotBeCombinedWithThisRef);
        }
        Ref head = repo.exactRef(newCommit.getName());
        if (head == null || head.getObjectId() == null)throw new RefNotFoundException(MessageFormat.format(JGitText.get().refNotResolved,newCommit.getName()));
        final ObjectId headId = head.getObjectId();
        if (headId == null)throw new RefNotFoundException(MessageFormat.format(JGitText.get().refNotresolved, newCommit.getName()));
        final RevCommit headCommit = walk.lookupCommit(headId);
        if (walk.isMergedInto(newCommit, headCommit))return newCommit;
        final String headName = head.getName();
        final Ref ref = repo.exactRef(HEAD);
        if (ref != null && ref.getObjectId() != null&& !ref.getObjectId().isSymbolic()) {
            try {
                RefUpdate update = repo.updateRef(HEAD);
                update.setForceUpdate(true);
                RevCommit result = update.getNewHead();
                if (result != null) {
                    return result;
                }
                throw new NoWorkTreeException(JGitText.get().noWorktreeDetachedFromRef);
            }
        }
        catch (IOException e) {
            throw new InvalidRefNameException(HEAD, e);
        }
    }
    throw new RefNotFoundException(MessageFormat.format(JGitText.get().cannotReachCommit, newCommit.getName()));
    }
}