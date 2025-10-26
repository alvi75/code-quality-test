import java.util.*;

public class Translation812 {
    public void include(String name, ObjectId id) {
    checkValidRefName(name);
    if (include.containsKey(name)) {
        throw new IllegalStateException(MessageFormat.format(JGitText.get().duplicateRef, name));
    }
    include.put(name, id.toObjectId());
}
}