import java.util.*;

public class Generated_636766f01a6d9265ec01762e {
    /**Check whether the array of the double type is empty.**/
    public static boolean isEmpty(final double[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                return false;
            }
        }
        return true;
    }
}