import java.util.*;

public class Translation866 {
    public AreaEval offset(int relFirstRowIx, int relLastRowIx, int relFirstColIx, int relLastColIx) {
    if (getRefEval() == null) {
        return getAreaEval().offset(relFirstRowIx, relLastRowIx, relFirstColIx, relLastColIx);
    }
    return getRefEval().offset(relFirstRowIx, relLastRowIx, relFirstColIx, relLastColIx);
}
}