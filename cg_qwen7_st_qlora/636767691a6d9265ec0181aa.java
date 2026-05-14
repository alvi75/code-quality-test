import java.util.*;

public class Generated_636767691a6d9265ec0181aa {
    public static int nullSafeHashCode(long[] array){
        if (array == null) {
            return 0;
        }
        int result = INITIAL_HASH;
        for (long element : array) {
            result = MULTIPLIER * result + Long.hashCode(element);
        }
        return result;
    }
}