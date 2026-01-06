import java.util.*;

public class Translation541 {
    public BytesRef next() {
    int termUpto = _termUpto;
    if (termUpto == _info.terms.size()) {
        return null;
    }
    else {
        info.terms.get(info.sortedTerms[termUpto], br);
        return br;
    }
}
}