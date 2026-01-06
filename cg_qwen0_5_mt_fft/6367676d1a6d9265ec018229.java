import java.util.*;

public class Generated_6367676d1a6d9265ec018229 {
    public static String[] trimArrayElements(String[] array) {
        if (array == null || array.length == 0)
            return new String[0];
        int length = array.length;
        for (int i = 0; i < length; i++) {
            array[i] = array[i].trim();
        }
        return array;
    }
}