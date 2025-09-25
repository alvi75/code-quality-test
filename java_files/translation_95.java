import java.util.*;

public class Translation95 {
    public OrdRange getOrdRange(String dim) {
    OrdRange result = prefixToOrdRange.get(dim);
    if (result == null) {
        throw new IllegalArgumentException("Unknown dimension " + dim);
    }
    return result;
}
}