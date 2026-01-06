import java.util.*;

public class Translation298 {
    1 public static double[] grow(double[] array, int minSize) {
    assert minSize >= 0 : "size must be positive (got " + minSize + "): likely integer overflow?";
    if (array.length < minSize) {
        final double[] newArray = new double[oversize(minSize, Double.BYTES)];
        System.arraycopy(array, 0, newArray, 0, array.length);
        return newArray;
    }
    elsereturn array;
}
}