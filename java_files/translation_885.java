import java.util.*;

public class Translationtranslation_885 {
    public RevCommit tryFastForward(RevCommit newCommit) {
        RevCommit headCommit = null;
        try (RevWalk headWalk = new RevWalk(repo)) {
            Ref head = repo.exactRef(HEAD);
            if (head != null)headCommit = headWalk.parseCommit(head.getObjectId());
        }
        catch (IOException e) {
            throw new JGitInternalException(e.getMessage(), e);
        }
        if (headCommit == null)throw new NoHeadException(JGitText.get().noHEADExistsAndNoExplicitStartingRevisionWasSpecified);
        if (!headCommit.getTree().equals(newCommit.getTree()))return newCommit;
        String headName = HEAD;
        try {
            RefUpdate ru = repo.updateRef(headName);
            ru.setForceUpdate(true);
            headCommit = headWalk.parseCommit(ru.getObjectId());
        }
        catch (IOException e) {
            throw new JGitInternalException(JGitText.get().anExceptionOccurredWhileTryingToForceUpdateTheRef, e);
        }
        return headCommit;
    }
}