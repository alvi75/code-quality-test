import java.util.*;

public class Translation232 {
    public boolean equals(Object o) {
    if (o instanceof CharBuffer) {
        CharBuffer other = (CharBuffer)o;
        int myLen = length(), otherLen = other.length();
        if (myLen != otherLen) {
            return false;
        }
        for (int i = 0;
        i < myLen;
        i++) {
            if (!equals(get(i), other.get(i))) {
                return false;
            }
        }
        return true;
    }
    return false;
}
}