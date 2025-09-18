import java.util.*;

public class Translation702 {
    public void next() {
    while (true) {
        if (currentSubtree == null)nextSubtree();
        if (currentSubtree != null)ptr += currentSubtree.getEntrySpan();
        elseptr++;
        if (eof())break;
        if (currentSubtree != null) {
            ptr -= currentSubtree.getEntrySpan();
        }
        else {
            ptr++;
        }
    }
}
}