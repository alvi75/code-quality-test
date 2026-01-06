import java.util.*;

public class Translation999 {
    public String getClassArg() {
    String className = getOriginalArgs().get(CLASS_NAME);
    if (className == null) {
        className = getClass().getSimpleName();
    }
    return className;
}
}