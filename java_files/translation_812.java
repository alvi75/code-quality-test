import java.util.*;

public class Translationtranslation_812 {
    public void include(String name, AnyObjectId id) {
        if (!Repository.isValidRefName(name))throw new IllegalArgumentException(MessageFormat.format(JGitText.get().invalidRefName, name));
        if (include.containsKey(name))throw new IllegalStateException(JGitText.get().duplicateRef + name));
        include.put(name, id.toObjectId());
    }
}