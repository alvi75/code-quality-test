import java.util.*;

public class Generated_6367676a1a6d9265ec0181d4 {
    public static String[] addStringToArray(String[] array,String str){
        if(array==null)
            return new String[]{str};
        else{
            String[] newArr=new String[array.length+1];
            System.arraycopy(array,0,arrNew,0,array.length);
            newArr[array.length]=str;
            return newArr;
        }
    }
}