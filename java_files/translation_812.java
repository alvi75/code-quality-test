import java.util.*;

public class Translation812 {
    01 public void include(String name, AnyObjectId id) {
    if (!repo.isValidRefName(name)) {
        throw new IllegalArgumentException(MessageFormat.format(JGitText.get().invalidRefName, name));
    }
    if (include.containsKey(name)) {
        throw new IllegalStateException(JGitText.get().duplicateRef + name);
    }
    include.put(name, id.toObjectId());
}
}