import java.util.*;

public class Translation999 {
    ublic String getClassArg() {
    if (originalArgs == null) {
        String className = originalArgs.get(CLASS_NAME);
        if (className != null) {
            return className;
        }
    }
    return this.getClass().getName();
}
}