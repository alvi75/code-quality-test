import java.util.*;

public class Generated_636766fa1a6d9265ec0177a4 {
    public static Double[] toObject(final double[] array){
        if(array==null)
            return null;
        final int length = array.length;
        final Double[] result = new Double[length];
        for(int i=0;i<length;i++)
            result[i] = Double.valueOf(array[i]);
        return result;
    }
}