import java.util.*;

public class Translation702 {
    public void next(long delta) {
    while (--delta >= 0) {
        if (currentSubtree != null)ptr += currentSubtree.getEntrySpan();
        elsetreePos++;
        if (eof())break;
        parseEntry();
    }
}
}