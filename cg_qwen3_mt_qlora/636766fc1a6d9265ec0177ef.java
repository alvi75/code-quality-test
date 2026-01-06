import java.util.*;

public class Generated_636766fc1a6d9265ec0177ef {
    /**Return a new array of strings converted from the elements which are not null of the given array,if the size of the array is zero,it will throw an exception.*/
    static String[] toNoNullStringArray(Object[] array){
        if(array.length==0)throw new IllegalArgumentException("The array must have at least one element");
        int count=0;
        for(int i=0;i<array.length;i++){
            if(array[i]!=null)count++;
        }
        String[] result=new String[count];
        count=0;
        for(int i=0;i<array.length;i++){
            if(array[i]!=null){
                result[count]=array[i].toString();
                count++;
            }
        }
        return result;
    }
}