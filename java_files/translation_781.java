import java.util.*;

public class Translation781 {
    public void setPrecedenceFilterSuppressed(boolean value) {
    if (value) {
        setReachesIntoOuterContext(PrecedenceFilter.SuppressPredicate);
    }
    else {
        setReachesIntoOuterContext(PrecedenceFilter.DefaultPredicate);
    }
}
}