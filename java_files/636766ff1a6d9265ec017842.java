import java.util.*;

public class Generated_636766ff1a6d9265ec017842 {
    public static double[] toPrimitive(final Double[] array){
        if(array == null || array.length == 0) {
            return EMPTY_DOUBLE_ARAY;
        } else {
            final double[] result = new double[array.length];
            for (int i = 0; i < array.length; i++) {
                result[i] = array[i];
            }
            return result;
        }
    }
}