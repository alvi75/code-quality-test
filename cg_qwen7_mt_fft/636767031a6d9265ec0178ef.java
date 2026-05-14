import java.util.*;

public class Generated_636767031a6d9265ec0178ef {
    private static Object copyArrayGrow1(final Object array, final Class<?> newArrayComponentType) {
        int oldLength = java.lang.reflect.Array.getLength(array);
        if (oldLength == 0) return Array.newInstance(newArrayComponentType, 1);

        // Allocate new array of correct size.
        final Object newArray =
                Array.newInstance(newArrayComponentType, oldLength + 1);

        // Copy contents from old array to new array.
        System.arraycopy(
                array,
                0,
                newArray,
                0,
                oldLength
        );

        return newArray;
    }
}