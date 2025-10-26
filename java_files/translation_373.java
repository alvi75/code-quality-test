import java.util.*;

public class Translation373 {
    public void setReadonly(boolean readonly) {
    if (readonly && !isReadOnly()) {
        throw new IllegalStateException("can't alter read-only IntervalSet");
    }
    readOnly = readonly;
}
}