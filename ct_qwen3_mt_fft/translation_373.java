import java.util.*;

public class Translation373 {
    public void setReadonly(boolean readonly) {
    if (this.readonly && !readonly)throw new IllegalStateException("can't alter readonly IntervalSet");
    this.readonly = readonly;
}
}