import java.util.Set;
import java.util.HashSet;
import java.util.*;

public class Translationtranslation_373 {
    public void setReadonly(boolean readonly) {
        if ( this.readonly && !readonly ) {
            throw new IllegalStateException("can't alter readonly IntervalSet");
        }
        this.readonly = readonly;
    }
}