import java.util.*;

public class Translation702 {
    public void next(int delta) {
    while (--delta >= 0) {
        if (currentSubtree != null)nextSubtreePos = currentSubtree.nextEntryPos();
        ptr++;
        parseEntry(false);
        if (eof())break;
    }
}
}