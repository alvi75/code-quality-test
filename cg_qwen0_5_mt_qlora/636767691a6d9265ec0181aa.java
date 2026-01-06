import java.util.*;

public class Generated_636767691a6d9265ec0181aa {
    public static int nullSafeHashCode(long[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        long hash = 1;
        for (int i = 0; i < array.length; i++) {
            hash = (hash * MULTIPLIER) + (long) array[i];
        }
        return (int) hash;
    }
}