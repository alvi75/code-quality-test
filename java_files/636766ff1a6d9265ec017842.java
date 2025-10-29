import java.util.*;

public class Generated_636766ff1a6d9265ec017842 {
    public static double[] toPrimitive(final Double[] array) {
        if (array == null || array.length == 0) {
            return EMPTY_DOUBLE_ARRAY;
        }
        final double[] primitiveArray = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            primitiveArray[i] = array[i];
        }
        return primitiveArray;
    }
}