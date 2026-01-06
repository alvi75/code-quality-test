import java.util.*;

public class Generated_6367676c1a6d9265ec018204 {
    public static String[] concatenateStringArrays(String[] array1, String[] array2) {
        if (array1 == null || array2 == null) return null;
        int length = array1.length + array2.length;
        String[] result = new String[length];
        System.arraycopy(array1, 0, result, 0, array1.length);
        System.arraycopy(array2, 0, result, array1.length, array2.length);
        return result;
    }
}