import java.util.*;

public class Generated_636766fa1a6d9265ec017796 {
    /**Convert an array of primitive booleans to objects.**/
    public static Boolean[] toObject(final boolean[] array) {
        final Boolean[] result = new Boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = Boolean.valueOf(array[i]);
        }
        return result;
    }
}