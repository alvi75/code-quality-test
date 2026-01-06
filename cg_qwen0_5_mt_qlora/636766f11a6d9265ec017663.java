import java.util.*;

public class Generated_636766f11a6d9265ec017663 {
    public static boolean isSameLength(final double[] array1,final double[] array2){
        if(array1 == null && array2 == null) {
            return true;
        }
        if(array1 == null || array2 == null) {
            return false;
        }
        if(array1.length != array2.length) {
            return false;
        }
        return true;
    }
}