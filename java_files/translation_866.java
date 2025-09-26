import java.util.*;

public class Translation866 {
    1 public AreaEval offset(int relFirstRowIx, int relLastRowIx, int relFirstColIx, int relLastColIx) {
    if (areaEval == null) {
        return areaEval.offset(relFirstRowIx, relLastRowIx, relFirstColIx, relLastColIx);
    }
    return refEval.offset(relFirstRowIx, relLastRowIx, relFirstColIx, relLastColIx);
}
}