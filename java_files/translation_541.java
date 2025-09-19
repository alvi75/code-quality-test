import java.util.*;

public class Translation541 {
    public BytesRef next() {
    termUpto++;
    if (termUpto >= info.terms.size()) {
        return null;
    }
    else {
        info.terms.get(info.sortedTerms[termUpto], br);
        return br;
    }
}
}