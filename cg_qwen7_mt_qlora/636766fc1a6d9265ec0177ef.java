import java.util.*;

public class Generated_636766fc1a6d9265ec0177ef {
    /**Return a new array of strings converted from the elements which are not null of the given array,if the size of the array is zero,it will throw an exception.*/
    static String[] toNoNullStringArray(Object[] array){
        if(array == null || array.length <= 0)throw new IllegalArgumentException("The parameter 'array' must be not null.");
        int count = 0;
        for(int i=0;i<array.length;i++){
            Object o = array[i];
            if(o != null && !"".equals(o.toString())){
                count++;
            }
        }
        if(count <= 0)return new String[0];
        String[] result = new String[count];
        int index = 0;
        for(int i=0;i<array.length;i++){
            Object o = array[i];
            if(o != null && !"".equals(o.toString())){
                result[index++] = o.toString();
            }
        }
        return result;
    }
}