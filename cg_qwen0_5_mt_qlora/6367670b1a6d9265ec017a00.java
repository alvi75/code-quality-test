import java.util.*;

public class Generated_6367670b1a6d9265ec017a00 {
    public static boolean isSameLength(final byte[] array1, final byte[] array2) {
        if (array1 == null || array2 == null) {
            return false;
        }
        int len1 = array1.length;
        int len2 = array2.length;
        if (len1 != len2) {
            return false;
        }
        for (int i = 0; i < len1; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
}