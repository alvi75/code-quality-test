import java.util.*;

public class Generated_6367676c1a6d9265ec018204 {
    /**Concatenate two string arrays into one.
@since 0.9
@param array1 first array to concatenate
@param array2 second array to concatenate
@return concatenated array
*/
public static String[] concatenateStringArrays(String[] array1, String[] array2) {
        if (array1 == null || array1.length == 0)
            return array2;
        else if (array2 == null || array2.length == 0)
            return array1;

        int length = array1.length + array2.length;
        String[] result = new String[length];
        System.arraycopy(array1, 0, result, 0, array1.length);
        System.arraycopy(array2, 0, result, array1.length, array2.length);

        return result;
    }
}