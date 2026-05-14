import java.util.*;

public class Translation999 {
    public String getClassArg() {
    String className;
    if (null != originalArgs) {
        className = originalArgs.get(CLASS_NAME);
    }
    else {
        className = getClass().getName();
    }
    return className;
}
}