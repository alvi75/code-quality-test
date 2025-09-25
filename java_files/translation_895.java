import java.util.*;

public class Translation895 {
    public int get(int index, long[] arr, int off, int len) {
    assert len > 0 : "len must be > 0 (got " + len + ")";
    assert index >= 0 && index < valueCount;
    final int lenToCopy = Math.min(len, valueCount - index);
    System.arraycopy(value, index, arr, off, lenToCopy);
    return lenToCopy;
}
}