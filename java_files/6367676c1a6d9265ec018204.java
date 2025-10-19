import java.util.*;

public class Generated_6367676c1a6d9265ec018204 {
    /**Concatenate two string arrays into one.**/
    public static String[] concatenateStringArrays(String[] array1,String[] array2){
        int len1=array1.length;
        int len2=array2.length;
        String[] result=new String[len1+len2];
        System.arraycopy(array1,0,result,0,len1);
        System.arraycopy(array2,0,result,len1,len2);
        return result;
    }
}