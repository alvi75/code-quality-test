import java.util.*;

public class Generated_636767031a6d9265ec0178ef {
    /**Copy the given array and add a default value at the end.
@since 2013-04-15
@param array The array to be copied.
@param newArrayComponentType The component type of the new array.
@return A new array with one more element than the original array.
*/
public static Object copyArrayGrow1(final Object array,
                                       final Class<?> newArrayComponentType){
        return copyArrayGrow(array,newArrayComponentType,1);
    }
}