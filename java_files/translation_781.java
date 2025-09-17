import java.util.*;

public class Translationtranslation_781 {
    public void setPrecedenceFilterSuppressed(boolean value) {
        if (value) {
            this.reachesIntoOuterContext |= REACHES_INTO OuterContext.SUPPRESS_PRECEDENCE_FILTER;
        }
        else {
            this.reachesIntoOuterContext &= ~REACHES_INTOOuterContext.SUPPRESS_PRECEDENCE_FILTER;
        }
    }
}