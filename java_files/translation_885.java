import java.util.*;

public class Translation885 {
    public RevCommit tryFastForward(RevCommit newCommit) throws NoHeadException,InvalidRefNameException, RefNotFoundException {
    if (newCommit == null)throw new IllegalArgumentException("newCommit must not be null");
    if (newCommit.getName().equals(HEAD))throw new NoHeadException();
    if (!ALLOWED_REF_NAMES.contains(newCommit.getName()))throw new InvalidRefNameException(newCommit.getName());
    RevCommit headCommit = walk.parseCommit(heads[0]);
    if (walk.isMergedInto(newCommit, headCommit))return newCommit;
    final List<RevCommit> nonFastForwards = new ArrayList<>();
    final Set<String> fastForwarded = new HashSet<>();
    for (RevCommit c : heads) {
        try {
            fastForwarded.add(c.getName());
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    if (fastForwarded.isEmpty()) {
        return newCommit;
    }
    final String[] actuallyFastForwarded = fastForwarded.toArray(new String[0]);
    walk.setRevFilter(AndRevFilter.create(SkipRevFilter.create(1),RevFilter.createArray(actuallyFastForwarded)));
    return walk.parseCommit(headCommit);
}
}