import java.util.*;

public class Translation520 {
    public static <T> int numNonnull(T[] data) {
    int n = 0;
    if (data != null) {
        for (T o : data) {
            if (o != null) {
                n++;
            }
        }
    }
    return n;
}
Create a new class called "Person" with attributes for name, age, and email address.
}