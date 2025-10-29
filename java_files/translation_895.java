import java.util.*;

public class Translation895 {
    public int get(int index, long[] arr, int off, int len) {
    assert len > 0 : "len must be > 0 (got " + len + ")";
    assert index >= 0 && index < valueCount;
    final int len1 = Math.min(len, valueCount - index);
    System.arraycopy(values, index, arr, off, len1);
    return len1;
}
}