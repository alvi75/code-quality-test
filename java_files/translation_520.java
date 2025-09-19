import java.util.*;

public class Translation520 {
    public static <T> int numNonNull(T[] array) {
    if (array == null) {
        return 0;
    }
    int result = 0;
    for (T element : array) {
        if (element != null) {
            result++;
        }
    }
    return result;
}
}