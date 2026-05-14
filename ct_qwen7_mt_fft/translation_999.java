import java.util.*;

public class Translation999 {
    public String getClassArg() {
    String className = getClassName();
    if (className == null) {
        return getClass().getSimpleName();
    }
    else {
        return className;
    }
}
}