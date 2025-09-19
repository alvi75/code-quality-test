import java.util.*;

public class Translation812 {
    ublic void include(String name, AnyObjectId id) {
    if (!isSupported(name))throw new UnsupportedOperationException(JGitText.get().cannotInclude + " " + name);
    if (id == null)throw new IllegalArgumentException(JGitText.get().theIdMustNotBeNull);
    map.put(nameWithDotGit(name), id.toObjectId());
}
}