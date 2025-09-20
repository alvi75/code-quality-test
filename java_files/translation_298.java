import java.util.*;

public class Translation298 {
    public static double[] Grow(double[] array, int minSize) {
    assert minSize >= 0 : "size must be positive (got " + minSize + "): likely integer overflow?";
    if (array.length < minSize) {
        double[] newArray = new double[Oversize(minSize, Double.BYTES)];
        System.Array.Copy(array, 0, newArray, 0, array.length);
        return newArray;
    }
    else {
        return array;
    }
}
}