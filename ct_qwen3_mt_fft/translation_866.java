import java.util.*;

public class Translation866 {
    public AreaEval offset(int relFirstRowIx, int relLastRowIx,int relFirstColIx, int relLastColIx) {
    if (_refEval == null) {
        return _areaEval.offset(relFirstRowIx, relLastRowIx, relFirstColIx, relLastColIx);
    }
    return _refEval.offset(relFirstRowIx, relLastRowIx, relFirstColIx, relLastColIx);
}
}