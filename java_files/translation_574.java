import java.util.*;

public class Translation574 {
    public static boolean[] copyOf(boolean[] original, int newLength) {
    if (original == null) {
        return null;
    }
    if (original.length == 0) {
        return EMPTY_BOOLEAN_ARRAY;
    }
    if (newLength > original.length) {
        return new boolean[newLength];
    }
    else {
        return Arrays.copyOfRange(original, 0, newLength);
    }
}
}