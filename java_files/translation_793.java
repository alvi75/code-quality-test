import java.util.*;

public class Translation793 {
    1 public int compareTo(BytesRef other) {
    if (other == null) {
        throw new NullPointerException("other is null");
    }
    int diff = length - other.length;
    if (diff != 0) {
        return diff;
    }
    for (int i = 0;
    i < length;
    i++) {
        byte b1 = bytes[i];
        byte b2 = other.bytes[i];
        if (b1 != b2) {
            return b1 - b2;
        }
    }
    return 0;
}
}