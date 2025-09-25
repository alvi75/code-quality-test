import java.util.*;

public class Translation552 {
    public synchronized int lastIndexOf(String subString, int start) {
    int len = SubstringHelper.length(subString);
    if (len == 0) {
        return -1;
    }
    if (start < 0 || start > length()) {
        throw new IndexOutOfRangeException();
    }
    for (int i = length() - len;
    i >= start;
    --i) {
        if (subString.equals(SubstringHelper.substring(i, i + len))) {
            return i;
        }
    }
    return -1;
}
}