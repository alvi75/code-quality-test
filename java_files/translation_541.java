import java.util.*;

public class Translation541 {
    public BytesRef next() {
    final int termUpto = this.termUpto;
    this.termUpto++;
    if (termUpto >= info.terms.size()) {
        return null;
    }
    else {
        info.terms.get(info.sortedTerms.get(termUpto), br);
        return br;
    }
}
}