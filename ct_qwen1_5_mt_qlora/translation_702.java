import java.util.*;

public class Translation702 {
    public final void next(final int delta) {
    for (;
    --delta >= 0;
    ) {
        if (currentSubtree != null) {
            ptr += currentSubtree.getEntrySpan();
        }
        else {
            ptr++;
        }
        if (eof()) {
            break ;
        }
        parseEntry();
    }
}
}