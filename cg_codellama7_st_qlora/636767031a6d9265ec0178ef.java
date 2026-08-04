import java.util.*;

public class Generated_636767031a6d9265ec0178ef {
    private static Object copyArrayGrow1(final Object array,final Class<?> newArrayComponentType){
        final int length=Array.getLength(array);
        final Object newArray=Array.newInstance(newArrayComponentType,length+1);
        for(int i=0;i<length;i++){
            Array.set(newArray,i,Array.get(array,i));
        }
        return newArray;
    }
}