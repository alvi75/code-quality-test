import java.util.*;

public class Translation373 {
    public void setReadOnly(boolean readOnly) {
    if (!readOnly && this.readOnly) {
        throw new IllegalStateException("can't alter readonly IntervalSet");
    }
    this.readOnly = readOnly;
}
}