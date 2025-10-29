import java.util.*;

public class Translation702 {
    0;
int delta = 0;
while (delta < 0) {
    if (currentSubtree != null) {
        ptr += currentSubtree.getEntrySpan();
    }
    else {
        ptr++;
    }
    if (eof) {
        break;
    }
    parseEntry();
    delta--;
}
}