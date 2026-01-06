import java.util.*;

public class Translation781 {
    public void setPrecedenceFilterSuppressed(boolean value) {
    if (value) {
        this.reachesIntoOuterContext |= PRECEDENCE_SUPPRESSOR;
    }
    else {
        this.reachesIntoOuterContext &= ~PRECEDENCE_SUPPRESSOR;
    }
}
}