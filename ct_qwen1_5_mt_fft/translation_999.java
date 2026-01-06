import java.util.*;

public class Translation999 {
    public String getClassArg() {
    if ( null!=originalArgs ) {
        String className = originalArgs.get(CLASS_NAME);
        if ( null!=className ) return className;
    }
    return getClass().getSimpleName();
}
}