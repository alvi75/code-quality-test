import java.util.*;

public class Generated_636767691a6d9265ec0181aa {
    /**Compute the hash code of the whole array, by accumulating the multiplication of each element hash code and the  MULTIPLIER.*/
    public static int nullSafeHashCode(long[] array) {
        if (array == null)
            return 0;
        int result = 1;
        for (long aArray : array) {
            result *= MULTIPLIER;
            result += Long.hashCode(aArray);
        }
        return result;
    }
}