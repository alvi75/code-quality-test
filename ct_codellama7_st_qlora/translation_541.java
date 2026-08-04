import java.util.*;

public class Translation541 {
    public BytesRef next() {
    termUpto++;
    if (termUpto >= info.terms.size()) {
        return null;
    }
    else {
        info.terms.get(info.sortedTerms.get(termUpto), br);
        return br;
    }
}
}