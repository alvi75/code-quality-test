import java.util.*;

public class Generated_636767031a6d9265ec0178ef {
    /**Copy the given array and add a default value at the end.**/
    private static Object copyArrayGrow1(final Object array,final Class<?> newArrayComponentType){
        final int length = Array.getLength(array);
        final Object newArray = Array.newInstance(newArrayComponentType,length+1);
        System.arraycopy(array,0,newArray,0,length);
        return newArray;
    }
}