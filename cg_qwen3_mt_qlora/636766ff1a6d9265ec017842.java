import java.util.*;

public class Generated_636766ff1a6d9265ec017842 {
    /**If the length of the array is 0, return EMPTY_DOUBLE_ARAY. Otherwise, convert the array to an array of the double type.*/
    public static double[] toPrimitive(final Double[] array) {
        if (array == null || array.length == 0) {
            return EMPTY_DOUBLE_ARAY;
        }
        final double[] result = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i].doubleValue();
        }
        return result;
    }
}