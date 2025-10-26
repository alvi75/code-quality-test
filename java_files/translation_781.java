import java.util.*;

public class Translation781 {
    ublic void setPrecedenceFilterSuppressed(boolean value) {
    if (value) {
        setReachesIntoOuterContext(SUPPRESS_PRECEDENCE_FILTER);
    }
    else {
        setReachesIntoOuterContext(~SUPPRESS_PRECEDENCE_FILTER);
    }
}
}