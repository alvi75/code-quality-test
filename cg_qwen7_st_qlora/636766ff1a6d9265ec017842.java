import java.util.*;

public class Generated_636766ff1a6d9265ec017842 {
    public static double[] toPrimitive(final Double[] array){
        if(array == null || array.length == 0) {
            return EMPTY_DOUBLE_ARRAY;
        }
        
        final int len = array.length;
        final double[] result = new double[len];
        for(int i=0; i < len; i++){
            result[i] = array[i].doubleValue();
        }
        return result;
    }
}