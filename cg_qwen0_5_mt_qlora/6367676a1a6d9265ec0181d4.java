import java.util.*;

public class Generated_6367676a1a6d9265ec0181d4 {
    /**Append a string to a string array.**/
public static String[] addStringToArray(String[] array,String str){
        if(array == null) return new String[0];
        String[] newArray = new String[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[array.length] = str;
        return newArray;
    }
}