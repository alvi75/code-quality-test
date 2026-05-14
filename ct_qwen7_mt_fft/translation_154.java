import java.util.*;

public class Translation154 {
    public static int lookupIndexByName(String name) {
    FunctionMetadata fm = getInstance().getFunctionByNameInternal(name);
    if(fm == null) return -1;
    return fm.getIndex();
}
}