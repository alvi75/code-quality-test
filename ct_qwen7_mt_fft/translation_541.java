import java.util.*;

public class Translation541 {
    public BytesRef next() {
    termUpto++;
    if (termUpto >= info.terms.size()) {
        return null;
    }
    else {
        TermInfo ti = info.terms.get(info.sortedTerms[termUpto]);
        br.bytes = ti.bytes;
        br.length = ti.length;
        return br;
    }
}
}