import java.util.Set;
import java.util.HashSet;
import java.util.*;

public class Translationtranslation_373 {
    public void setReadOnly(boolean readonly) {
        if (!isWritable()) {
            throw new IllegalStateException("can't alter readonly IntervalSet");
        }
        this.readonly = readonly;
    }
    }
}