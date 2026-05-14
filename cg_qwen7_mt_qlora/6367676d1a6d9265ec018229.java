import java.util.*;

public class Generated_6367676d1a6d9265ec018229 {
    /**Trim each element in the given string array and return the resulting array.**/
    public static String[] trimArrayElements(String[] array) {
        if (array == null || array.length == 0) {
            return array;
        }
        int nonNull = 0;
        for (String s : array) {
            if (s != null) {
                ++nonNull;
            }
        }
        String[] result = new String[nonNull];
        int pos = 0;
        for (String s : array) {
            if (s != null) {
                result[pos++] = s.trim();
            }
        }
        return result;
    }
}