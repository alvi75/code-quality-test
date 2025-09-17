import java.util.*;

public class Translationtranslation_520 {
    public static int numNonnull(Object[] data) {
        int n = 0;
        for (Object o : data) {
            if (o != null) {
                n++;
            }
        }
        return n;
    }
}