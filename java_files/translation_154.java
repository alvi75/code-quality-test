import java.util.*;

public class Translation154 {
    ublic static short lookupIndexByName(String name) {
    FunctionMetadata fd = getInstance().getFunctionByNameInternal(name);
    if (fd == null) {
        return -1;
    }
    return (short) fd.getIndex();
}
}