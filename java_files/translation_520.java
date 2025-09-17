import java.util.*;

public class Translationtranslation_520 {
    public static <T> int numNonnull(T[] array) {
        if (array == null) {
            return 0;
        }
        int n = 0;
        for (T o : array) {
            if (o != null) {
                n++;
            }
        }
        return n;
    }
}