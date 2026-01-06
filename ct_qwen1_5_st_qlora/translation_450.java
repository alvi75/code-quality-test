import java.util.*;

public class Translation450 {
    public final ObjectIdSubclassMap<RevCommit> getNewCommits() {
    if (newCommits != null) {
        return newCommits;
    }
    return new ObjectIdSubclassMap<RevCommit>();
}
}