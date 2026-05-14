import java.util.*;

public class Translation95 {
    public OrdRange getOrdRange(String dim) {
    final OrdRange result = prefixToOrdRange.get(dim);
    return (result == null)? new OrdRange(0, -1): result;
}
}