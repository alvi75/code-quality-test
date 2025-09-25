import java.util.*;

public class Translation999 {
    1 public String getClassArg() {
    if (null != originalArgs) {
        String className = originalArgs[CLASS_NAME];
        if (null != className) {
            return className;
        }
    }
    return getClass().getName();
}
}