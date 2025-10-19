import java.util.*;

public class Generated_636767691a6d9265ec0181aa {
    public static int nullSafeHashCode(long[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        long hash = 0;
        for (int i = 0; i < array.length; ++i) {
            hash = (hash * MULTIPLIER) + array[i];
        }
        return (int) hash;
    }
}