import java.util.Set;
import java.util.HashSet;
import java.util.*;

public class Translationtranslation_221 {
    public StringBuilder stem(String word) {
        String cmd = stemmer.getLastOnPath(word);
        if (cmd == null)return null;
        buffer.setLength(0);
        buffer.append(word);
        final DiffCommand diff = new DiffCommand(repo);
        diff.setPathFilter(PathFilterGroup.createFromStrings(cmd));
        diff.setSourcePrefix(" ");
        diff.setTargetPrefix(" ");
        diff.setAlgorithm(DiffAlgorithm.SINGLE);
        try (SubmoduleWalk walk = SubmoduleWalk.forIndex(repo)) {
            ObjectInserter inserter = repo.newObjectInserter();
            inserter.setAllowNonFastForwards(true);
            inserter.setRetainBody(true);
            walk.setObjectInserter(inserter);
            Set<String> initialized = new HashSet<>();
            while (walk.next()) {
                if (walk.getDir() != null)continue;
                String path = walk.getPath();
                String url = walk.getTarget();
                String update = getUpdate(path);
                if (url != null)walk.setRefSpec(url);
                else if (update != null)walk.setRefSpec(update);
            }
            initialized.addAll(walk.getModules());
            walk.setRefSpecs(null);
            for (String s : initialized)importModule(s);
        }
        inserter.commit();
        return buffer;
    }
    catch (IOException e) {
        throw new JGitInternalException(e.getMessage(), e);
    }
    }
}