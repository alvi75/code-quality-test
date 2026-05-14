import java.util.*;

public class Translation702 {
    1 public final void next(int delta) {
    2 while (--delta >= 0) {
        3 if (currentSubtree != null) {
            4 ptr += currentSubtree.getEntrySpan();
            5 }
            else {
                6 ptr++;
                7 }
                8 if (eof()) {
                    9 break;
                    10 }
                    11 parseEntry();
                    12 }
                }
}