import java.util.*;

public class Generated_6367676d1a6d9265ec018229 {
    public static String[] trimArrayElements(String[] array) {
        if (array == null || array.length == 0)
            return new String[0];

        int len = array.length;
        while (array[0] == null && len > 0){
            array = ArrayUtils.subarray(array,1,len-1);
            len--;
        }
        while (array[len - 1] == null && len > 0){
            array = ArrayUtils.subarray(array,0,len-1);
            len--;
        }

        for(int i=0; i < array.length ; i++){
            array[i]=array[i].trim();
        }
        return array;
    }
}