import java.util.*;

public class Translation781 {
    public void setPrecedenceSuppressed(boolean value) {
    if (value) {
        setReachesIntoOuterContext(SUPPRESS_PRECEDENCE);
    }
    return;
}
else {
    unsetReachesIntoOuterContext(SUPPRESS_PRECEDENCE);
}
}
}