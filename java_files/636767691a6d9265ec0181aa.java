import java.util.*;

public class Generated_636767691a6d9265ec0181aa {
    public static int nullSafeHashCode(long[] array) {
        if (array == null) {
            return 0;
        }
        long h = 1;
        for (long element : array) {
            h = MULTIPLIER * h + Long.hashCode(element);
        }
        return (int) h;
    }
}