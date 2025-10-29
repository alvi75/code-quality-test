import java.util.*;

public class Translation999 {
    01 public String getClassArg() {
    if (originalArgs != null) {
        String className = originalArgs[CLASS_NAME];
        if (className != null) {
            return className;
        }
    }
    return this.getClass().getName();
}
}