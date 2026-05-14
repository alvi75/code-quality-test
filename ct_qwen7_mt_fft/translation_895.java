import java.util.*;

public class Translation895 {
    public int get(int index, long[] arr, int off, int len) {
    assert len > 0 : "len must be > 0 (got " + len + ")";
    assert index >= 0 && index < valueCount;
    final int gets = Math.min(len, valueCount - index);
    for (int i=0;
    i<gets;
    ++i)arr[off+i] = values[index+i];
    return gets;
}
}