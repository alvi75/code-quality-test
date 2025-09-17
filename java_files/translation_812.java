import java.util.*;

public class Translationtranslation_812 {
    public void include(String name, AnyObjectId id) {
        if (name == null)throw new IllegalArgumentException(JGitText.get().nameMustNotBeNull);
        if (id == null)throw new IllegalArgumentException(JGitText.get().idMustNotBeNull);
        if (include.containsKey(name))throw new IllegalStateException(JGitText.get().duplicateRef + name);
        include.put(name, id);
    }
}