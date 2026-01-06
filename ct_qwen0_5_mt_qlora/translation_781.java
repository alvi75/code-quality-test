import java.util.*;

public class Translation781 {
    public void setPrecedenceFilterSuppressed(boolean value) {
    if (value) {
        setReachesIntoOuterContext(SUPPRESS_PRECEDENCE_FILTER);
    }
    else {
        setReachesIntoOuterContext( ~(SUPPRESS_PRECEDENCE_FILTER ));
    }
}
}