import java.util.*;

public class Translation895 {
    public int get(int index, long[] arr, int off, int len) {
    assert len > 0;
    assert index >= 0 && index < valueCount;
    len = Math.min(len, valueCount - index);
    Arrays.fill(arr, off, off + len, 0);
    return len;
}
}