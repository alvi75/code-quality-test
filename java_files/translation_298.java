import java.util.*;

public class Translation298 {
    public static double[] grow(double[] array, int minSize) {
    assert minSize >= 0 : "size must be positive (got " + minSize + "): likely integer overflow?";
    if (array.length < minSize) {
        final int newSize = Oversize(minSize, RamUsageEstimator.NUM_BYTES_DOUBLE);
        final double[] newArray = new double[newSize];
        System.arraycopy(array, 0, newArray, 0, array.length);
        return newArray;
    }
    else {
        return array;
    }
}
}