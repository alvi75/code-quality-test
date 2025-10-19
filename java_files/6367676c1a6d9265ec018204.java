import java.util.*;

public class Generated_6367676c1a6d9265ec018204 {
    /**Concatenate two string arrays into one.*/
    public static String[] concatenateStringArrays(String[] array1,String[] array2){
        if(array1==null) return array2;
        if(array2==null) return array1;

        int length = array1.length + array2.length;
        String[] result = new String[length];
        System.arraycopy(array1,0,result,0,array1.length);
        System.arraycopy(array2,0,result,array1.length,length-array1.length);

        return result;
    }
}