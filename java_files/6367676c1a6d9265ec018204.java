import java.util.*;

public class Generated_6367676c1a6d9265ec018204 {
    /**Concatenate two string arrays into one.**/
    public static String[] concatenateStringArrays(String[] array1,String[] array2){
        String[] result = new String[array1.length + array2.length];
        System.arraycopy(array1, 0, result, 0, array1.length);
        System.arraycopy(array2, 0, result, array1.length, array2.length);
        return result;
    }
}