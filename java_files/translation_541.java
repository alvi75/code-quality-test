import java.util.*;

public class Translation541 {
    public BytesRef next() {
    termUpto++;
    if (termUpto >= info.terms.length) return null;
    else {
        BytesRef r = new BytesRef();
        info.terms.get(info.sortedTerms[termUpto], r);
        return r;
    }
}
}