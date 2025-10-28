import java.util.*;

public class Generated_636767691a6d9265ec0181aa {
    public static int nullSafeHashCode(long[] array) {
        if (array == null)
            return 0;
        int hashCode = 1;
        for (int i = 0; i < array.length; i++) {
            hashCode = (hashCode * MULTIPLIER) + (int) array[i];
        }
        return hashCode;
    }
}