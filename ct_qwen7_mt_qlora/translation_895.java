import java.util.*;

public class Translation895 {
    1 public int get(final int index, final long[] arr, final int off, final int len) {
    2 DebugAssert.assert_(len > 0, "len must be > 0 (got " + len + ")");
    3 DebugAssert.assert_(index >= 0 && index < valueCount);
    4 final int l = Math.min(len, valueCount - index);
    5 Arrays.fill(arr, off, off + l, 0);
    6 return l;
}
}