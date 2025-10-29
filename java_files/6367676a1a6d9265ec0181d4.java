import java.util.*;

public class Generated_6367676a1a6d9265ec0181d4 {
    /**Append a string to a string array.**/
    public static String[] addStringToArray(String[] array,String str){
        if(array==null) {
            array = new String[1];
            array[0] = str;
        } else {
            for(int i=0;i<array.length;i++) {
                if(array[i]==null) {
                    array[i] = str;
                    break;
                }
            }
        }
        return array;
    }
}