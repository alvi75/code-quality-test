import java.util.*;

public class Translation95 {
    public final OrdRange getOrdRange(String dim) {
    OrdRange result = prefixToOrdRange.get(dim);
    return result;
}
}