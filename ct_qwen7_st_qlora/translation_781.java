import java.util.*;

public class Translation781 {
    public void setPrecedenceFilterSuppressed(boolean value) {
    if ( value ) this.reachesIntoOuterContext |= SUPPRESS_PRECEDENCE_FILTER;
    elsethis.reachesIntoOuterContext &= ~SUPPRESS_PRECEDENCE_FILTER;
}
}