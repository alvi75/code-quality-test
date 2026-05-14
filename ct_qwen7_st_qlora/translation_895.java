import java.util.*;

public class Translation895 {
    public int get(int index, long arr[], int off, int len) {
    assert len > 0 : "len must be > 0 (got "+ len + ")";
    assert index >= 0 && index < valueCount;
    final int end = Math.min(index+len, valueCount);
    for (;
    index < end;
    ++index, ++off)arr[off] = get(index);
    return end-index;
}
}