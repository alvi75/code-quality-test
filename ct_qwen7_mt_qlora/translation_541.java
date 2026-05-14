import java.util.*;

public class Translation541 {
    1 public BytesRef next() {
    2 termUpto++;
    3 if (termUpto >= info.terms.size()) {
        4 return null;
        5 }
        else {
            6 info.terms.get(info.sortedTerms[termUpto], br);
            7 return br;
            8 }
        }
}