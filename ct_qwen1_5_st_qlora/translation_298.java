import java.util.*;

public class Translation298 {
    public static float[] grow(float[] array, int minSize) {
    assert minSize >= 0: "size must be positive (got " + minSize + "): likely integer overflow?";
    if (array.length < minSize) {
        float[] newArray = new float[oversize(minSize, Float.BYTES)];
        System.arraycopy(array, 0, newArray, 0, array.length);
        return newArray;
    }
    elsereturn array;
}
}