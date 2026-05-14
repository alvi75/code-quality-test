import java.util.*;

public class Translation373 {
    1 public void setReadonly(boolean readonly) {
    2 if ( this.readonly && !readonly )3 throw new IllegalStateException("can't alter readonly IntervalSet");
    4 this.readonly = readonly;
}
}