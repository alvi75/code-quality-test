import java.util.*;

public class Translation812 {
    1 public void include(String name, AnyObjectId id) {
    2 if (!Repository.isValidRefName(name))3 throw new IllegalArgumentException(MessageFormat.format(JGitText.get().invalidRefName, name));
    4 if (include.containsKey(name))5 throw new IllegalStateException(JGitText.get().duplicateRef + name);
    6 include.put(name, id.toObjectId());
}
}