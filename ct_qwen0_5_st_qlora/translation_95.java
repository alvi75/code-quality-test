import java.util.*;

public class Translation95 {
    public OrdRange getOrdRange(String dim) {
    OrdRange result = prefixToOrdRange.get(dim);
    if (result == null) {
        result = new OrdRange(0, 0);
        prefixToOrdRange.put(dim, result);
    }
    return result;
}
}