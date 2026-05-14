import java.util.*;

public class Translation781 {
    1 public void setPrecedenceFilterSuppressed(boolean value) {
    2 if (value) {
        3 this.reachesIntoOuterContext |= SUPPRESS_PRECEDENCE_FILTER;
        4 }
        else {
            5 this.reachesIntoOuterContext &= ~SUPPRESS_PRECEDENCE_FILTER;
            6 }
        }
}