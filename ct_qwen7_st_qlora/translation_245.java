import java.util.*;

public class Translation245 {
    public boolean equals(Object o) {
    if (o instanceof Toffs) {
        Toffs b = (Toffs) o;
        return startOffset == b.startOffset && endOffset == b.endOffset;
    }
    return false;
}
}