import java.util.*;

public class Translation999 {
    ublic String getClassArg() {
    if ( null != originalArgs ) {
        String className = originalArgs[ CLASS_NAME ];
        if ( null != className ) {
            return className;
        }
    }
    return this.getClass().getName();
}
}