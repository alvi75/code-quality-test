import java.util.*;

public class Translation895 {
    public int get(int index, long[] arr, int off, int len) {
    assert len > 0 : "len must be > 0 (got " + len + ")";
    assert index >= 0 && index < valueCount;
    int len2 = Math.min(len, valueCount - index);
    System.arraycopy(value, index, arr, off, len2);
    return len2;
}
}