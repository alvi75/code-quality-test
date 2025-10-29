import java.util.*;

public class Generated_6367676c1a6d9265ec018204 {
    /**Concatenate two string arrays into one.**/
public static String[] concatenateStringArrays(String[] array1,String[] array2){
        if(array1 == null || array2 == null) return new String[0];
        int length = 0;
        for (int i=0;i<array1.length;i++){
            length += array1[i].length();
        }
        for (int i=0;i<array2.length;i++){
            length += array2[i].length();
        }
        String[] result = new String[length];
        int index = 0;
        for (int i=0;i<array1.length;i++){
            System.arraycopy(array1[i],0,result[index++]);
        }
        for (int i=0;i<array2.length;i++){
            System.arraycopy(array2[i],0,result[index++]);
        }
        return result;
    }
}