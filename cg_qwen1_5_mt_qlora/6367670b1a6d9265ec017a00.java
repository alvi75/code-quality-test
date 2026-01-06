import java.util.*;

public class Generated_6367670b1a6d9265ec017a00 {
    /** Check whether the length of the given two byte arrays is the same.
 * @param array1 The first byte array to check.
 * @param array2 The second byte array to check.
 * @return <code>true</code> if both byte arrays have the same length,
 *         otherwise <code>false</code>.
 */
public static boolean isSameLength(final byte[] array1, final byte[] array2) {
        return (array1 == null && array2 == null)
                || (array1 != null && array2 != null && array1.length == array2.length);
    }
}