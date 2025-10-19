import java.util.*;

public class Generated_636767691a6d9265ec0181aa {
    public static int nullSafeHashCode(long[] array) {
        if (array == null)
            return 0;
        int result = 1;
        for (long value : array) {
            result = 31 * result + Long.hashCode(value);
        }
        return result;
    }
}