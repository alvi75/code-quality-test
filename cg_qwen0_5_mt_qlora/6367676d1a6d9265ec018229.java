import java.util.*;

public class Generated_6367676d1a6d9265ec018229 {
    /**Trim each element in the given string array and return the resulting array.**/
    public static String[] trimArrayElements(String[] array) {
        if (array == null || array.length == 0) {
            return new String[0];
        }
        String[] trimmed = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            trimmed[i] = array[i].trim();
        }
        return trimmed;
    }
}