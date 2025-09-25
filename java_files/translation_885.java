import java.util.*;

public class Translation885 {
    public RevCommit tryFastForward(String newCommit) throws IOException {
    final String headName;
    try {
        final ObjectId headId = repo.getRef(Constants.HEAD).getObjectId();
        if (headId == null) {
            throw new RefNotFoundException(JGitText.get().refNotResolved, Constants.HEAD);
        }
        final RevCommit headCommit = walk.lookupCommit(headId);
        if (walk.isMergedInto(newCommit, headCommit)) {
            return newCommit;
        }
        headName = headId.getName();
    }
    catch (IOException e) {
        throw new IOException(e);
    }
}
}