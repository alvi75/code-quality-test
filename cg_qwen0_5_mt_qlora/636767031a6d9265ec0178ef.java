import java.util.*;

public class Generated_636767031a6d9265ec0178ef {
    private static Object copyArrayGrow1(final Object array,
                                         final Class<?> newArrayComponentType) {
        if (array == null) {
            return Array.newInstance(newArrayComponentType, 0);
        }
        int length = Array.getLength(array);
        Object newArray = Array.newInstance(newArrayComponentType, length + 1);
        System.arraycopy(array, 0, newArray, 0, length);
        return newArray;
    }
}