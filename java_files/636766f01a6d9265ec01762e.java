import java.util.*;

public class Generated_636766f01a6d9265ec01762e {
    public static boolean isEmpty(final double[] array) {
        if (array == null || array.length == 0) {
            return true;
        }
        for (int i = 0; i < array.length; i++) {
            if (Double.isNaN(array[i])) {
                return false;
            }
        }
        return true;
    }
}