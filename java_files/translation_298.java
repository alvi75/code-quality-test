import java.util.*;

public class Translation298 {
    public static long[] grow(long[] array, int minSize) {
    assert minSize >= 0: "size must be positive (got " + minSize + "): likely integer overflow?";
    if (array.length < minSize) {
        return growExact(array, oversize(minSize, Long.BYTES));
    }
    elsereturn array;
}
}