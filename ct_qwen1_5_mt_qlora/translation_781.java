import java.util.*;

public class Translation781 {
    public void setPrecedenceFilterSuppressed(boolean value) {
    if (value) {
        reachesIntoOuterContext |= SUPPRESS_PRECEDENCE_FILTER;
    }
    else {
        reachesIntoOuterContext &= ~SUPPRESS_PRECEDENCE_FILTER;
    }
}
}