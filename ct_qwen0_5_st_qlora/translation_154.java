import java.util.*;

public class Translation154 {
    public static int lookupIndexByName(String name) {
    FunctionMetadata fd = getFunctionByName(name);
    if (fd == null) {
        return -1;
    }
    return (int)fd.index;
}
}