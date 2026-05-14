import java.util.*;

public class Generated_636767031a6d9265ec0178ef {
    /**Copy the given array and add a default value at the end.**/
    private static Object copyArrayGrow1(final Object array,
                                         final Class<?> newArrayComponentType) {
        if (array != null) {
            int arrayLength = Array.getLength(array);
            Object newArray = Array.newInstance(newArrayComponentType, arrayLength + 1);
            System.arraycopy(array, 0, newArray, 0, arrayLength);
            return newArray;
        }
        else {
            // null check ensures no need to check component type
            return Array.newInstance(newArrayComponentType, 1);
        }
    }
}