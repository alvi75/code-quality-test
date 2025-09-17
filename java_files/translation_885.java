import java.util.*;

public class Translationtranslation_885 {
    public RevCommit tryFastForward(RevCommit newCommit)throws IOException {
        Ref head = repo.exactRef(HEAD);
        if (head == null || head.getObjectId() == null)throw new RefNotFoundException(MessageFormat.format(JGitText.get().refNotResolved,HEAD));
    }
    ObjectId headId = head.getObjectId();
    if (headId == null)throw new RefNotFoundException(MessageFormat.format(JGitText.get().refNotResolved,HEAD));
    }
    RevCommit headCommit = walk.lookupCommit(headId);
    if (isMergedInto(newCommit, headCommit))return newCommit;
    String headName = head.getName();
    if (newCommit.getParentCount() > 0 && newCommit.getParent(0).getName().equals(headName))return newCommit;
    return null;
    }
}