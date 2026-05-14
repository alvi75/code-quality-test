import java.util.*;

public class Generated_6367676a1a6d9265ec0181d4 {
    /**Append a string to a string array.**/
    public static String[] addStringToArray(String[] array,String str){
        if(array==null||array.length==0) return new String[]{str};
        else{
            String[] result=new String[array.length+1];
            System.arraycopy(array, 0, result, 0, array.length);
            result[result.length-1]=str;
            return result;
        }
    }
}