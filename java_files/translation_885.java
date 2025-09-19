import java.util.*;

public class Translation885 {
    ublic RevCommit tryFastForward(RevCommit newCommit) {
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
    String message = JGitText.get().fastForwardFailedMessage + "\n" +"commit "+ newCommit.getName() + "\ndoes not fast forward "+ headCommit.getName()+ "\n";
    throw new FastForwardFailedException(message);
}
}