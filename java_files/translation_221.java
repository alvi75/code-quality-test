import java.util.*;

public class Translation221 {
    public StringBuilder stem(String word) {
    String cmd = stemmer.getLastOnPath(word);
    if (cmd == null)return null;
    buffer.setLength(0);
    buffer.append(word);
    final DiffCommand diff = new DiffCommand(repo);
    diff.setPatch(new UnidecodePatch(cmd));
    if (ignoreCase)diff.setIgnoreCase(true);
    try (SubmoduleWalk walk = SubmoduleWalk.forIndex(repo)) {
        ObjectId headId = walk.getId();
        if (!walk.isFinished())throw new JGitInternalException(JGitText.get().exceptionDuringExecutionOfStemmer, walk.getHeadId());
    }
    catch (IOException e) {
        throw new JGitInternalException(JGitText.get().exceptionDuringExecutionOfStemmer, e);
    }
    return buffer.toString();
}
}