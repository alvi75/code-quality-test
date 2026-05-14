import java.util.*;

public class Translation298 {
    public static float[] grow(float[] array, int minSize) {
    assert minSize >= 0 : "size must be positive (got " + minSize + "): likely integer overflow?";
    if (array.length < minSize) {
        float[] copy = new float[minSize];
        System.arraycopy(array, 0, copy, 0, array.length);
        return copy;
    }
    else {
        return array;
    }
}
}