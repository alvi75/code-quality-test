import java.util.*;

public class Translationtranslation_520 {
    public static <T> int numNonNull(T[] data) {
        int n = 0;
        for (T o : data) {
            if (o != null) {
                n++;
            }
        }
        return n;
    }
}