import java.util.*;

public class Translation9 {
    public SubmoduleAddCommand setPath(String path) {
    if (path == null)throw new NullPointerException(JGitText.get().pathMustBeSpecified);
    this.path = path;
    return this;
}
}