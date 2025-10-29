import java.util.*;

public class Translation154 {
    public static int lookupIndexByName(String name) {
    FunctionMetadata fd = getInstance().getFunctionByNameInternal(name);
    if (fd == null) {
        return -1;
    }
    return fd.index;
}
}