import java.util.*;

public class Translation702 {
    public void next(int delta) {
    while (--delta >= 0) {
        if (currentSubtree != null)ptr += currentSubtree.getEntrySpan();
        elseptr++;
        if (eof)break;
        parseEntry();
    }
}
}