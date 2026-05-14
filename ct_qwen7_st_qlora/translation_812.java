import java.util.*;

public class Translation812 {
    public void include(String name, AnyObjectId id)throws InvalidRefNameException {
    if (!Repository.isValidRefName(name))throw new InvalidRefNameException(MessageFormat.format(JGitText.get().invalidRefName,name));
    if (include.containsKey(name))throw new IllegalArgumentException(MessageFormat.format(JGitText.get().duplicateRef, name));
    include.put(name, id.copy());
}
}