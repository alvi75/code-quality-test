import java.util.*;

public class Translation154 {
    public static short lookupIndexByName(String name) {
    FunctionMetadata fd = getFunctionByKey(name);
    if (fd == null) {
        return -1;
    }
    return (short) fd.getIndex();
}
}