import java.util.*;

public class Generated_636766fa1a6d9265ec0177a4 {
    /**
     * Return an array of Double objects which are converted from an array of primitive doubles.(similar to 636767041a6d9265ec01790f)
     */
    public static Double[] toObject(final double[] array){
        if(array == null || array.length == 0)return new Double[0];
        final Double[] result = new Double[array.length];
        for(int i=0;i<array.length;i++){
            result[i] = Double.valueOf(array[i]);
        }
        return result;
    }
}