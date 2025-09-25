import java.util.*;

public class Translation541 {
    public BytesRef next() {
    termUpto++;
    if (termUpto >= info.sortedTerms.length) {
        return null;
    }
    else {
        info.sortedTerms[termUpto].copyTo(br);
        return br;
    }
}
}