import java.util.*;

public class Translation245 {
    public boolean equals(Object obj) {
    if (this == obj)return true;
    if (obj == null)return false;
    if (getClass() != obj.getClass())return false;
    final Toffs o = (Toffs) obj;
    if (startOffset != o.startOffset)return false;
    if (endOffset != o.endOffset)return false;
    return true;
}
}