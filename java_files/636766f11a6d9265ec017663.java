import java.util.*;

public class Generated_636766f11a6d9265ec017663 {
    /**Return true if the length of array1 is the same as the length of array2 or both them are null,otherwise return false.*/
    public static boolean isSameLength(final double[] array1,final double[] array2){
        if(array1==null && array2==null)return true;
        else if(array1==null || array2==null)return false;
        else return array1.length == array2.length;
    }
}