import java.util.*;

public class Translation373 {
    public void setReadOnly(boolean readonly) {
    if ( this.readOnly && !readonly ){
        throw new IllegalStateException("can't alter readonly IntervalSet");
    }
    this.readOnly = readonly;
}
}