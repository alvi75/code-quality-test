import java.util.*;

public class Translation781 {
    ublic void setPrecedenceFilterSuppressed(boolean value) {
    if ( value ) {
        this.reachesIntoOuterContext |= SUPPRESS_PRECEDENCE_FILTER;
    }
    else {
        this.reachesIntoOuterContext &= ~SUPPRESS_PRECEDENCE_FILTER;
    }
}
}