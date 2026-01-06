import java.util.*;

public class Translation373 {
    public void setReadOnly(boolean readonly) {
    if (isReadOnly() && !readonly) {
        throw new IllegalStateException("can't alter readonly IntervalSet");
    }
    this.isReadOnly = readonly;
}
}