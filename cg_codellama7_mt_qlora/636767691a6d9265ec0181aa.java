import java.util.*;

public class Generated_636767691a6d9265ec0181aa {
    public static int nullSafeHashCode(long[] array) {
        if (array == null) {
            return 0;
        }
        int hash = INITIAL_NON_NULL_HASH_VALUE;
        for (long element : array) {
            hash = MULTIPLIER * hash + element;
        }
        return hash;
    }
}