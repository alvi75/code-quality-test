import java.util.*;

public class Translation796 {
    public SortedSetDocValuesFacetField(String dim, String label) {
    super("dummy", DocValuesType.SORTED_SET);
    verifyLabel(label);
    verifyLabel(dim);
    this.dim = dim;
    this.label = label;
}
}