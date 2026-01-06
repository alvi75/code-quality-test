import java.util.*;

public class Generated_636767031a6d9265ec0178ef {
    /**Copy the given array and add a default value at the end.**/
    private static Object copyArrayGrow1(final Object array,
                                          final Class<?> newArrayComponentType){
        if(array == null) return null;
        int length = Array.getLength(array);
        Object result = Array.newInstance(newArrayComponentType,length+1);
        System.arraycopy(array,0,result,0,length);
        return result;
    }
}