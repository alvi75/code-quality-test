import java.util.*;

public class Translation298 {
    public static long[] grow(long[] array, int minSize) {
    assert minSize >= 0: "size must be positive (got " + minSize + "): likely integer overflow?";
    if (array.length < minSize) {
        final long[] newArray = new long[growByPowerOfTwo(array.length, minSize)];
        System.arraycopy(array, 0, newArray, 0, array.length);
        return newArray;
    }
    elsereturn array;
}
}