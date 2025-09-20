import java.util.*;

public class Translation812 {
    public void include(String name, AnyObjectId id) {
    if (!isValidRefName(name))throw new IllegalArgumentException(MessageFormat.format(JGitText.get().invalidRefName, name));
    if (include.containsKey(name))throw new IllegalStateException(getMessage(JGitText.get().duplicateRef+name));
    include.put(name, id.toObjectId());
}
}