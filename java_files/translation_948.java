import java.util.*;

public class Translation948 {
    0;
}
else{
    int offset, count = m_maxScan;
    if (start >= buffer.length()) {
        return start;
    }
    for (offset = start;
    offset < buffer.length() && count > 0;
    count--) {
        if (m_boundaryChars.contains(buffer.charAt(offset))) {
            return offset;
        }
        offset++;
    }
    return start;
}
}
}