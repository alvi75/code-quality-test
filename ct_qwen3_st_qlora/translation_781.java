import java.util.*;

public class Translation781 {
    ublic void setPrecedenceFilterSuppressed(boolean value) {
    if ( value ) {
        this.reachesIntoOuterContext |= PRECEDENCE_FILTER_SUPPRESS;
    }
    else {
        this.reachesIntoOuterContext &= ~PRECEDENCE_FILTER_SUPPRESS;
    }
}
}